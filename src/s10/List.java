package s10;

public interface List<T> {
    T get(int i);

    void put(T e);

    void put(int i, T e);

    void remove(int i);

    void remove(T e);

    int length();
}
