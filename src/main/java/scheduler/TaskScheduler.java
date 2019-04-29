package scheduler;

import java.time.LocalDateTime;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TaskScheduler implements Scheduler {

    public TaskScheduler() {
        Thread thread = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(100);
                    Task task = queue.peek();
                    while(task != null && task.getTime().isBefore(LocalDateTime.now())) {
                        //Drain the queue for all the tasks which are before the currentTime
                        task = queue.poll();
                        task.run();
                        task = queue.peek();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    BlockingQueue<Task> queue = new PriorityBlockingQueue<>();

    @Override
    public boolean scheduleTask(Task task) {
        return queue.add(task);
    }

    @Override
    public boolean deleteTask(Task task) {
        return queue.remove(task);
    }
}