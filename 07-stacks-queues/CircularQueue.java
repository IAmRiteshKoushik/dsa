public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // size is used because end cannot be used 
    }
    
    public boolean isEmpty() {
        return size == 0; // size is used because end cannot be used
    }

    // Useful function
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        // You are not required to shift elements in circular queue item removal
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front++]; // Remove and increase front in single statement
        front = front % data.length;
        size--;
        return removed;
    }

    // Print out the element in front
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    // Print out entire Queue
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front; // Don't alter the front, make a copy and work
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
