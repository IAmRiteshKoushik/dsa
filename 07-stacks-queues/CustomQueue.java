public class CustomQueue {
    // Usually queues is implemented with two-pointers : one at the 
    // beginning and one at the end. So, it becomes easy to also 
    // convert it into a Double Ended Queue
    
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0; 

    // Constructors
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        // This is the same as doing the following :
        // data[end] = item;
        // end++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
           throw new Exception("Queue is empty");
        }

        int removed = data[0]; // Queues remove from the beginning
        // Shift all elements to one place forward and set last element to zero
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- "); 
        }
        System.out.println("END");
    }

    // UTILITY FUNCTIONS
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0; // Checking whether the queue is empty
    }
}

