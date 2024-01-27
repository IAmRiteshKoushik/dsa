public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1; // First insertion makes the ptr stand at 0

    // Default constructor
    public CustomStack(){
        this(DEFAULT_SIZE); // Calling the below constructor
    }

    // Constructor for stack with defined size
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is full!!"); 
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        // Alt: return data[ptr--]; // All three lines reduced in one line
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length - 1; // returns a boolean value
    }

    protected boolean isEmpty(){
        return ptr == -1; // returns a boolean value
    }
}
