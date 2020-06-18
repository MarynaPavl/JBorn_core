package s11;

public class BinaryTree {
    Node root;

    public void add(int value, String name) {
        Node node = new Node(value);
        node.name = name;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            while (true) {
                Node prev = current;

                if (value < prev.value) {
                    current = current.leftChild;
                    if (current == null) {
                        prev.leftChild = node;
                        return;
                    }
                } else if (value > prev.value) {
                    current = current.rightChild;
                    if (current == null) {
                        prev.rightChild = node;
                        return;
                    }
                } else return;
            }
        }

    }

    public void output() {
        inOrder(root);

    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.leftChild);
        System.out.printf("%s ", node.name);
        inOrder(node.rightChild);
    }

}

class Node {
    int value;
    String name;
    Node leftChild;
    Node rightChild;

    public Node(int value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
