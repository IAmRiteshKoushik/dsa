class MyStack {
    // This is a specific implementation of stack using the queue data structure
    // which is availble as an import in Java (or other languages) hence, their 
    // implementations can be done only after going through the available functions
    // that the classes have to offer. It would be a good idea to go through the 
    // available functions before hand.
    Deque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>(); 
    }
    
    public void push(int x) {
       queue.add(x);
    }
    
    public int pop() {
        pushBack(queue.size() - 1); // change n - 1 times so that last element becomes
        // first element of queue and it can be removed
        return queue.removeFirst();
    }
    
    public int top() {
       pushBack(queue.size() - 1);
       int ans = queue.removeFirst();
       queue.addLast(ans); // Once the answer has been captured, add it to the end and
       return ans; // return it as well
    }
    
    public boolean empty() {
        return queue.size() == 0; 
    }


    // Helper Functions
    private void pushBack(int count){
        int i = 0;
        while(i < count){
            queue.addLast(queue.removeFirst());
            i++;
        }
        // This is done because queue can remove only from 
        // first position
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
