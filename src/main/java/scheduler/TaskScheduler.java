package scheduler;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TaskScheduler implements Scheduler {

    TaskScheduler() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(100);
                        queue.peek();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    BlockingQueue<Task> queue = new PriorityBlockingQueue<>();

    @Override
    public boolean scheduleTask(Task task) {
        queue.add(task);
        return false;
    }

    @Override
    public boolean deleteTask(Task task) {
        queue.remove(task);
        return false;
    }
}