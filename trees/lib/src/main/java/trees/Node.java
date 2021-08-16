package trees;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
    Node<T> next;


    public Node(T value) {
        this.value = value;
    }
}
