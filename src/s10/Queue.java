package s10;

public interface Queue<T> {
    boolean add(T e);

    T poll();

    T peek();
}
