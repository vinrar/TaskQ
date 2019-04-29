package scheduler;

public interface Scheduler {

    /**
     *
     * @param task
     * @return whether the task is successfully scheduled or not
     */
    boolean scheduleTask(Task task);

    /**
     *
     * @param task
     * @return whether the task is successfully deleted or not
     */
    boolean deleteTask(Task task);
}
