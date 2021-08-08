package stacksAndQueues;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top;

    public void push(T value) {
        Node<T> node = new Node<T>(value);
        if (this.isEmpty()) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    public T pop() {
        if (!this.isEmpty()) {
            T result = this.top.value;
            Node<T> temp = this.top;
            this.top = this.top.next;
            temp.next = null;
            return result;
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!this.isEmpty()) {
            return this.top.value;
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;

    }


    @Override
    public String toString() {
        String result = "TOP\n";
        Node<T> current = this.top;
        while (current != null) {
            result += "{ " + current.value + " }\n";
            current = current.next;
        }
        return result;
    }
}
