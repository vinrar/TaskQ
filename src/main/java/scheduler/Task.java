package scheduler;

public class Task<K, V> implements Comparable<V> {

    private K key;

    private V value;

    Task(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
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

        if (this.key == null ? task.getKey() != null : this.key.equals(task.getKey())) {
            return false;
        }

        if (this.value == null ? task.getValue() != null : this.value.equals(task.getValue())) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(V o) {
        return 0;
    }
}