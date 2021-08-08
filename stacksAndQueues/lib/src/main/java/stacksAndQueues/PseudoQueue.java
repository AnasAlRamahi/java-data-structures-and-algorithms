package stacksAndQueues;

public class PseudoQueue<T> {
    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();

    public void pseudoEnqueue(T value){
        stack1.push(value);
    }

    public T pseudoDequeue(){
        while(stack1.top != null){
            stack2.push(stack1.pop());
        }
        T result = stack2.pop();
        while(stack2.top != null){
            stack1.push(stack2.pop());
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "NULL <- ";
        Node<T> current = stack1.top;
        while(current != null){
            result += "{ " + current.value + " } <- ";
            current = current.next;
        }
        result += "Front";
        return result;
    }
}
