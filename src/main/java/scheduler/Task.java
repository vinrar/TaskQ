package scheduler;

import java.time.LocalDateTime;

public class Task<K> implements Comparable<LocalDateTime> {

    private K key;

    private LocalDateTime time;

    Runnable runnable;

    public Task(K key, LocalDateTime time, Runnable runnable) {
        this.key = key;
        this.time = time;
        this.runnable = runnable;
    }

    public K getKey() {
        return this.key;
    }

    public LocalDateTime getTime() {
        return this.time;
    }

    public void run() {
        runnable.run();
    }

    public void editDateTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!Task.class.isInstance(o)) {
            return false;
        }

        final Task task = (Task) o;

        if (this.key == null ? task.getKey() != null : !this.key.equals(task.getKey())) {
            return false;
        }

//        if (this.time == null ? task.getTime() != null : this.time.equals(task.getTime())) {
//            return false;
//        }

        return true;
    }

    @Override
    public int compareTo(LocalDateTime o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }
}