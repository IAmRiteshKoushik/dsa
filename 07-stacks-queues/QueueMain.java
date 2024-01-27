public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display(); // Printing out the entire queue
        System.out.println(queue.remove());
        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
    }
}
