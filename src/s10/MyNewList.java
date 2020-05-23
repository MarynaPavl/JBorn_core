package s10;

public class MyNewList<T> implements List<T> {
    int size;
    Node2<T> first;
    Node2<T> last;

    public void add(T el) {
        Node2<T> node2 = new Node2<>(el);
        if (first == null) {
            first = node2;
            last = node2;
        } else {
            last.next = node2;
            node2.prev = last;

            last = node2;
        }
        size++;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node2<T> current = search(i);
        return current.value;
    }

    public Node2<T> search(int i) {
        int a = 0;
        int b = size - 1;
        Node2<T> current = first;
        if (i < size / 2) {
            while (a != i) {
                current = current.next;
                a++;
            }
        } else {
            current = last;
            while (b != i) {
                current = current.prev;
                b--;
            }

        }
        return current;
    }

    @Override
    public void put(T e) {
        Node2<T> node2 = new Node2<>(e);
        last.next = node2;
        node2.prev = last;

        last = node2;
        size++;
    }

    @Override
    public void put(int i, T e) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        if (i == size) {
            put(e);
        } else {
            Node2<T> node2 = new Node2<>(e);
            Node2<T> current = search(i);

            Node2<T> previous = current.prev;
            node2.next = current;
            node2.prev = previous;
            current.prev = node2;
            previous.next = node2;

            size++;
        }
    }

    @Override
    public void remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node2<T> current = search(i);

        Node2<T> previous = current.prev;
        Node2<T> following = current.next;
        previous.next = following;
        following.prev = previous;
        current.next = null;
        current.prev = null;

        size--;

    }

    @Override
    public void remove(T e) {
        Node2<T> current = first;
        while (current.value != e) {
            current = current.next;
        } // не могу понять, как отсюда самой выбросить исключение, если такого значения єлемента не существует
        Node2<T> previous = current.prev;
        Node2<T> following = current.next;
        previous.next = following;
        if (following != null) {
            following.prev = previous;
        }
        current.next = null;
        current.prev = null;

        size--;
    }

    @Override
    public int length() {
        return size;
    }
}

class Node2<E> {
    E value;
    Node2<E> next;
    Node2<E> prev;

    public Node2(E value) {
        this.value = value;
    }
}

