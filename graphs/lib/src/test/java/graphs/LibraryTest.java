/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graphs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    // Code challenge 35:
    @Test void graphArrayListTest() {
        Graph graph = new Graph();
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");

        assertEquals("[]", graph.graphList.toString());
        graph.addNode(n1);
        assertTrue(graph.graphList.contains(n1)); //check if the node is inside the list
        graph.addNode(n2);
        assertTrue(graph.graphList.contains(n2)); //checking the second one if it is inside the array as well
        graph.addNode(n3);
        graph.addNode(n4);

        assertEquals("[A, B, C, D]", graph.toString()); //this will check if the getNodes works correctly

        assertEquals("[A -> A]", graph.edgeListString(n1)); //this will check if the addEdge and getNeighbors are working correctly
        graph.addEdge(n1, n2);
        assertEquals("[A -> B]", graph.edgeListString(n1)); //this will check if the addEdge and getNeighbors are working correctly
        graph.addEdge(n1, n3);
        assertEquals("[A -> B, C]", graph.edgeListString(n1)); //this will check if the addEdge and getNeighbors are working correctly
        graph.addEdge(n4, n3);
        assertEquals("[D -> C]", graph.edgeListString(n4)); //this will check if the addEdge and getNeighbors are working correctly

        assertEquals(4, graph.size()); //this will check if the size method works correctly
    }
}