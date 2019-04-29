package scheduler;

public class EditableTaskScheduler extends TaskScheduler implements EditableScheduler{

    @Override
    public boolean editTask(Task task) {
        deleteTask(task);
        return scheduleTask(task);
    }
}