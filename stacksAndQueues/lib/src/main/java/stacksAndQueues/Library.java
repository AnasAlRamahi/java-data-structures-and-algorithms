/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacksAndQueues;

public class Library {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//
//        System.out.println(stack);
//
//        System.out.println("The current top of the stack: " + stack.peek());


        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q);

        System.out.println(q.dequeue());
        System.out.println(q);

        System.out.println(q.dequeue());
        System.out.println(q);

        System.out.println(q.dequeue());
        System.out.println(q);

        System.out.println(q.dequeue());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.peek());
//
//        System.out.println(q.dequeue());
//        System.out.println(q);
//
//        System.out.println(q.dequeue());
//        System.out.println(q);





    }
}
