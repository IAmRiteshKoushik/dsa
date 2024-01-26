public class CLL {

    private Node head;
    private Node tail;

    // Default constructor
    public CLL(){
        this.head = null;
        this.tail = null;
    }

    // Insert at beginning or end
    public void insert(int val){
        Node node = new Node(val);

        // Empty Circular Linked List
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        // Non-empty
        tail.next = node;
        node.next = head;
        tail = node; // or head = node;
    }
   
    // Display function
    public void display(){
        Node node = head;
        if(head != null){
            // Atleast make one iteration and then starts rotating
            // Alt : Print from head to tail
            do {
               System.out.print(node.val + " -> "); 
               node = node.next;
            } while (node != head);
            System.out.println("BACK TO START");
        }
    }

    // Delete something
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        // Deleting the HEAD element
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
