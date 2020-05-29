package s10;

public class RealizationQueue<T> implements Queue<T> {
    int size;
    Node3<T> first;
    Node3<T> last;

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        Node3<T> curent = first;
        while (i != index) {
            curent = curent.next;
            i++;
        }
        return curent.value;
    }

    @Override
    public boolean add(T e) {
        if (e == null) {
            throw new NullPointerException("В эту колекцию запрещено добавлять null ");
        }
        Node3<T> node = new Node3<>(e);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;

            last = node;
        }
        size++;
        return true;
    }

    @Override
    public T poll() {
        if (first != null) {
            Node3<T> current = first.next;
            first = null;
            first = current;

            size--;

            return first.value; // не пойму, как сделать что бы pool() ничего не возвращал в этом случае????
        }
        return null;
    }

    @Override
    public T peek() {
        if (first == null) {
            return null;
        } else {
            return first.value;
        }
    }

    public int size() {
        return size;
    }
}

class Node3<E> {
    E value;
    Node3<E> next;

    public Node3(E value) {
        this.value = value;

    }
}

