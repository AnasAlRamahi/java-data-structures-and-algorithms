package trees;

import java.util.List;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
    Node<T> next;
    List<Node> children;

    public Node(T value) {
        this.value = value;
    }
}
