/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    //CodeChallenge05 Testing methods:
    @Test
    void instantiateLinkedList(){
        LinkedList ll = new LinkedList();
        assertNull(ll.Head);
    }

    @Test
    void canInsert(){
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        String expected = "{ 1 } -> { 2 } -> { 3 } -> NULL";
        assertEquals(expected, ll.toString());
    }

    @Test
    void headPointsRight(){
        LinkedList ll = new LinkedList();
        ll.insert(21);
        ll.insert(22);
        ll.insert(23);
        assertEquals(23 ,ll.Head.value);
    }

    @Test
    void canInsertMultiple(){
        LinkedList ll = new LinkedList();
        ll.insert(21);
        ll.insert(22);
        ll.insert(23);
        String expected = "{ 23 } -> { 22 } -> { 21 } -> NULL";
        assertEquals(expected ,ll.toString());
    }

    @Test
    void LinkedListIncludes(){
        LinkedList ll = new LinkedList();
        ll.insert(21);
        ll.insert(22);
        ll.insert(23);
        ll.insert(33);
        assertTrue(ll.includes(22));
        assertTrue(ll.includes(33));
    }

    @Test
    void LinkedListDoesntIncludes(){
        LinkedList ll = new LinkedList();
        ll.insert(21);
        ll.insert(22);
        ll.insert(23);
        ll.insert(33);
        assertFalse(ll.includes(1));
        assertFalse(ll.includes(44));
    }

    @Test
    void includesWorkingFine(){
        LinkedList ll = new LinkedList();
        ll.insert(21);
        ll.insert(22);
        ll.insert(23);
        ll.insert(33);
        String expected = "{ 33 } -> { 23 } -> { 22 } -> { 21 } -> NULL";
        assertEquals(expected, ll.toString());
    }


    //CodeChallenge06 Testing methods:

    @Test
    void addOneToTheEnd(){
        LinkedList ll = new LinkedList();

        ll.append(5);

        Node current = ll.Head;
        String actual = "";
        while(current != null){
            actual +=  "{ " + current.value + " } -> ";
            current = current.next;
        }
        actual += "NULL";

        String expected = "{ 5 } -> NULL";

        assertEquals(expected,actual);
    }

    @Test
    void addMultipleToTheEnd() {
        LinkedList ll = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        ll.Head = n1;
        n1.next = n2;

        ll.append(5);
        ll.append(6);
        ll.append(7);

        Node current = ll.Head;
        String actual = "";
        while (current != null) {
            actual += "{ " + current.value + " } -> ";
            current = current.next;
        }
        actual += "NULL";

        String expected = "{ 1 } -> { 2 } -> { 5 } -> { 6 } -> { 7 } -> NULL";

        assertEquals(expected, actual);
    }

    @Test
    void addBeforeMiddle(){
        LinkedList ll = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        ll.Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ll.insertBefore(3, 10);

        Node current = ll.Head;
        String actual = "";
        while(current != null){
            actual +=  "{ " + current.value + " } -> ";
            current = current.next;
        }
        actual += "NULL";

        String expected = "{ 1 } -> { 2 } -> { 10 } -> { 3 } -> { 4 } -> NULL";

        assertEquals(expected,actual);
    }

    @Test //This tests if it can add one node or multiple nodes at the end of the linked list:
    void addBeforeFirst(){
        LinkedList ll = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        ll.Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ll.insertBefore(1, 10);

        Node current = ll.Head;
        String actual = "";
        while(current != null){
            actual +=  "{ " + current.value + " } -> ";
            current = current.next;
        }
        actual += "NULL";

        String expected = "{ 10 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";

        assertEquals(expected,actual);

    }

    @Test
    void addAfterMiddle(){
        LinkedList ll = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        ll.Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ll.insertAfter(2, 10);

        Node current = ll.Head;
        String actual = "";
        while(current != null){
            actual +=  "{ " + current.value + " } -> ";
            current = current.next;
        }
        actual += "NULL";

        String expected = "{ 1 } -> { 2 } -> { 10 } -> { 3 } -> { 4 } -> NULL";

        assertEquals(expected,actual);
    }

    @Test
    void addAfterLast(){
        LinkedList ll = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        ll.Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ll.insertAfter(4, 10);

        Node current = ll.Head;
        String actual = "";
        while(current != null){
            actual +=  "{ " + current.value + " } -> ";
            current = current.next;
        }
        actual += "NULL";

        String expected = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 10 } -> NULL";

        assertEquals(expected,actual);
    }


    //CodeChallenge07 Testing methods:
    @Test
    void kGreaterThanLength(){
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        assertThrows(Exception.class, () -> {ll.kthFromEnd(66);});
    }

    @Test
    void kEqualsLength(){
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        assertThrows(Exception.class, () -> {ll.kthFromEnd(5);});
    }

    @Test
    void kNotPositive(){
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        assertThrows(Exception.class, () -> {ll.kthFromEnd(-1);});
    }

    @Test
    void listSizeOne(){
        LinkedList ll = new LinkedList();
        ll.append(10);
        Integer actual = 0;
        try{
            actual = ll.kthFromEnd(0);
        }catch(Exception e){
            e.printStackTrace();

        };
        assertEquals(10, actual);
    }

    @Test
    void kInTheMiddle(){
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(11);
        ll.append(12);
        ll.append(13);
        ll.insertBefore(13, 100);
        ll.insertAfter(10, 40);

        Integer actual = 0;
        try{
            actual = ll.kthFromEnd(4);
        }catch(Exception e){
            e.printStackTrace();

        };
        assertEquals(40, actual);
    }


    //CodeChallenge07 Testing methods:
    @Test
    void firstSameLengthSecond(){
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        LinkedList ll2 = new LinkedList();
        ll2.append(10);
        ll2.append(20);
        ll2.append(30);
        ll2.append(40);

        LinkedList expectedList = new LinkedList();
        expectedList.append(1);
        expectedList.append(10);
        expectedList.append(2);
        expectedList.append(20);
        expectedList.append(3);
        expectedList.append(30);
        expectedList.append(4);
        expectedList.append(40);

        assertEquals(expectedList.toString(), Library.zipLists(ll,ll2).toString());
    }

    @Test
    void firstMoreLengthThanSecond(){
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        LinkedList ll2 = new LinkedList();
        ll2.append(10);
        ll2.append(20);

        LinkedList expectedList = new LinkedList();
        expectedList.append(1);
        expectedList.append(10);
        expectedList.append(2);
        expectedList.append(20);
        expectedList.append(3);
        expectedList.append(4);

        assertEquals(expectedList.toString(), Library.zipLists(ll,ll2).toString());
    }

    @Test
    void firstLessLengthThanSecond(){
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);

        LinkedList ll2 = new LinkedList();
        ll2.append(10);
        ll2.append(20);
        ll2.append(30);
        ll2.append(40);

        LinkedList expectedList = new LinkedList();
        expectedList.append(1);
        expectedList.append(10);
        expectedList.append(2);
        expectedList.append(20);
        expectedList.append(30);
        expectedList.append(40);

        assertEquals(expectedList.toString(), Library.zipLists(ll,ll2).toString());
    }

    @Test
    void bothListsEmpty(){
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        LinkedList expectedList = new LinkedList();

        assertEquals(expectedList.toString(), Library.zipLists(ll,ll2).toString());
    }

    @Test
    void firstListEmpty(){
        LinkedList ll = new LinkedList();

        LinkedList ll2 = new LinkedList();
        ll2.append(10);
        ll2.append(20);
        ll2.append(30);

        LinkedList expectedList = new LinkedList();
        expectedList.append(10);
        expectedList.append(20);
        expectedList.append(30);

        assertEquals(expectedList.toString(), Library.zipLists(ll,ll2).toString());
    }

    @Test
    void secondListEmpty(){
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);

        LinkedList ll2 = new LinkedList();

        LinkedList expectedList = new LinkedList();
        expectedList.append(1);
        expectedList.append(2);
        expectedList.append(3);

        assertEquals(expectedList.toString(), Library.zipLists(ll,ll2).toString());
    }


}

