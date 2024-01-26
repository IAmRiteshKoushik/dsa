public class LL {

    private Node head; // Compulsory in implementations
    private Node tail; // Not compulsory in implementations
    private int size;

    // Constructor for the Linked-list
    public LL(){
        this.size = 0;
    }

    // Insertion of node at zeroth idnex
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++; // Don't forget to increase size
    }

    // Displaying all elements
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Insert of node at last index
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++; // Do not forget to increase the size of the LL
    }

    // Inserting node at any random position
    public void insert(int val, int index){
        if (index == 0) {
            insertFirst(val); 
            return;
        } 
        if(index == size){
            insertLast(val);
            return;
        } 

        Node temp = head; // Tranverse the LL
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // Deleting an element from the beginning
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val; // Return the deleted element (like pop)
    }
    // Deleting an element from the last
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    } 

    // Deleting an element from the middle
    public int deleteFromIndex(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1); // Get predecessor node
        int val = prev.next.value; // Obtain value of current node 
        prev.next = prev.next.next; // Connect predecessor to successor node 
        return val; // Effectively deleting current node

    }
    
    // UTILITY FUNCTION : Get Node based on Index
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
    // UTILITY FUNCTION : Get the first Node which you find the value
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node; // Effectively returning NULL
    }

    // Class for Nodes of a linked-list
    // Nodes of a linked-list :
    private class Node {
        private int value;
        private Node next;

        // Constructor for Node with no-next element
        public Node(int value){
            this.value = value;
        }

        // Constructor for Node with next element
        public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }
}
