package trees;

import java.util.EmptyStackException;

public class Queue<T>{
    Node<T> front;
    Node<T> rear;


    public void enqueue(Node node){
        if(this.isEmpty()){
            this.front = node;
            this.rear = node;
        }else{
            this.rear.next = node;
            rear = node;
        }
    }


    public T dequeue(){
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }else{
            T result = this.front.value;
            Node<T> temp = this.front;
            this.front = this.front.next;
            temp.next = null;
            return result;
        }
    }


    public T peek(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }else{
            return this.front.value;
        }
    }


    public boolean isEmpty(){
        if(this.front == null){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        String result = "FRONT -> ";
        Node<T> current = this.front;
        while(current != null){
            result += "{ " + current.value + " } -> ";
            current = current.next;
        }
        result += "REAR";
        return result;
    }
}



