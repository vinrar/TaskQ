package scheduler;

public interface EditableScheduler extends Scheduler{

    boolean editTask(Task task);
}