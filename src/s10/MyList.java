package s10;

public class MyList<E> {
    int size;
    Node<E> first;
    Node<E> last;


    public void add(E el) {
        Node<E> node = new Node<>(el);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.next = first;

            last = node;
        }
        size++;
    }

    boolean isCyclicity(Node<E> first) {
        if (first == null) {  //O(n)
            return false;   //O(1)
        }
        Node<E> slow = first; //O(1)
        Node<E> fast = first; // O(1)
        while (fast != null && fast.next != null) { //O(n)
            slow = slow.next; //O(1)
            fast = fast.next.next; //O(1)

            if (slow == fast) { //O(n)
                return true; //O(1)
            }
        }
        return false;//O(1)
    }
    //O(n) + O(1) + O(1) + O(1) + O(n) + O(1) + O(1) + O(n) + O(1) + O(1) = O(3n) + O(7) = O(3n+7) = O(n)
}

class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;

    }
}
