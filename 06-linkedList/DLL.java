public class DLL {

    Node head;
    // This time we are operating without size or tail
    // But if we choose to we can surely have them

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node; // Handling null pointer error
        }
        head = node; // new head
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head; // creating a reference to the last for traversing
        node.next = null;

        // For an empty list
        if(head == null){
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insertAfter(int after, int val){
       Node p = find(after);
       if(p == null){
           System.out.println("Does not exist");
       }

       Node node = new Node(val);
       node.next = p.next;
       p.next = node;
       node.prev = p;
       if (node.next != null){
           node.next.prev = node; // Handling null pointer exception
       }
    }

    // UTILITY FUNCTION : Find Node by Value
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node; // Return the first finding
            }
            node = node.next;
        }
        return null; // If not found
    }

    // Displaying the entire list
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse");
        while(last != null){
            System.out.print(last.value + " <- ");
            last = last.prev;
        }
        System.out.println("END");
    }

    // Class for Nodes of a linked-list
    // Nodes of a linked-list :
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        // Constructor for Node with no-next element
        public Node(int value){
            this.value = value;
            // Other values auto-initialize to null
        }

        // Constructor for Node with next element
        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}      
