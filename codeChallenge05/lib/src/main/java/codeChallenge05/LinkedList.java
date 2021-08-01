
package main.java.codeChallenge05;

public class LinkedList{
    public Node Head;

    public void insert(int value){
        Node newNode = new Node(value);

        if (Head == null){
            Head = newNode;
        }else{
            newNode.next = Head;
            Head = newNode;
        }
    }

    public boolean includes(int value){
        Node counter = Head;
        while(counter != null){
            if(counter.value == value){
                return true;
            }
            counter = counter.next;
        }
        return false;
    }

    public String toString(){
        Node counter = Head;
        String myLinkedList = "";
        while(counter != null){
            myLinkedList += "{ " + counter.value + " } -> ";
            counter = counter.next;
        }
        myLinkedList += "NULL";
        return myLinkedList;
    }

    public void append(int value){
        Node counter = Head;
        Node node = new Node(value);
        if(Head == null){
            Head = node;
            return;
        }
        while(counter != null){
            if (counter.next == null){
                counter.next = node;
                return;
            }
            counter = counter.next;
        }
    }

    public void insertBefore(int value, int newValue){
        Node counter = Head;
        Node node = new Node(newValue);
        while(counter.next != null){
            if(Head.value == value){
                node.next = Head;
                Head = node;
                return;
            }
            if(counter.next.value == value){
                node.next = counter.next;
                counter.next = node;
                return;
            }
            counter = counter.next;
        }
    }

    public void insertAfter(int value, int newValue){
        Node counter = Head;
        Node node = new Node(newValue);
        while(counter != null){
            if (counter.value == value){
                node.next = counter.next;
                counter.next = node;
            }
            counter = counter.next;
        }
    }

}