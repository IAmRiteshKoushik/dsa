import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * InbuildExamples
 */
public class InbuildExamples {

    public static void main(String[] args) {
        // // Using abstract data type for stack
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(45);
        // stack.push(2);
        // stack.push(9);
        // stack.push(10);
        //
        // System.out.println(stack.pop()); // Removes last element
        // System.out.println("Next trying out Queue");
        // // Queue is just an interface and is not an actual ADT in java
        // // Hence we internally use the LinkedList ADT which satisfies
        // // this interface.
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(3); // Enqueue -> HEAD
        // queue.add(6);
        // queue.add(5);
        // queue.add(19);
        // queue.add(1);
        //
        // System.out.println(queue.peek()); // Retrive but does not remove the HEAD
        // System.out.println(queue.remove()); // Retrive and remove the HEAD

        // Alt : Implementation
        // Resizable queues with lots of additional functionality which satisfies 
        // the deque interface
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(78);
        deque.addLast(78);
        deque.removeFirst();
        // etc, etc;
    }
}
