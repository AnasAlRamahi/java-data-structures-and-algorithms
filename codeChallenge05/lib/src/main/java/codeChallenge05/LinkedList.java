
public class LinkedList{
    Node Head;

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
}