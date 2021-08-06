
package codeChallenge05;

public class LinkedList{
    public Node Head;
    private int length;

    public LinkedList(){
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        length++;

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
        length++;
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
        length++;

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
        length++;

        while(counter != null){
            if (counter.value == value){
                node.next = counter.next;
                counter.next = node;
            }
            counter = counter.next;
        }
    }

    public Integer kthFromEnd(int k) throws Exception{

        int iterations = this.length - k;
        Node current = Head;

            if (this.length == 0){
                throw new IllegalArgumentException("Linked list is empty!");
            }else if (this.length == 1){
                if(k == 0){
                    return Head.value;
                }
                throw new Exception("Linked list has only one node!");
            }else if (k > length){
                throw new Exception("Argument number is high!");
            }else if (k == length){
                throw new Exception("Argument number equals the length,it should be less by one atleast!");
            }else if (k < 0){
                throw new Exception("Argument number is low!");
            }
            for (int i=0; i<iterations-1; i++){
                current = current.next;
            }
            return current.value;
    }

}