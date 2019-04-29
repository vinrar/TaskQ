import scheduler.EditableScheduler;
import scheduler.EditableTaskScheduler;
import scheduler.Task;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task<String> task = new Task<>("Task1", LocalDateTime.now().plusSeconds(10), new Worker());
        EditableScheduler scheduler = new EditableTaskScheduler();
        scheduler.scheduleTask(task);
        task.editDateTime(LocalDateTime.now().plusSeconds(40));
        scheduler.editTask(task);
        System.out.println("EOL");
    }
}
