package stacksAndQueues;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top;

    public void push(T value){
        Node<T> node = new Node<T>(value);
        if(this.isEmpty()){
            top = node;
        }else {
            node.next = top;
            top = node;
        }
    }

    public T pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }else{
            T result = this.top.value;
            Node<T> temp = this.top;
            this.top = this.top.next;
            temp.next = null;
            return result;
        }
    }

    public T peek(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }else{
            return this.top.value;
        }
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        String result = "TOP\n";
        Node<T> current = this.top;
        while(current != null){
            result += "{ " + current.value + " }\n ---------------- \n";
            current = current.next;
        }
        return result;
    }
}
