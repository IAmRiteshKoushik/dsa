// import java.util.LinkedList; // Direct implementation of Linked-list in Java


public class Main {
    public static void main(String[] args) {
        // There is an internal linked-list that Java provides by default
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);
        
        // Now, let us create a LinkedList from scratch in a separate file
        // LL list = new LL(); // this is only for numbers
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertFirst(6);
        // list.insertFirst(7);
        // list.insertLast(99);
        // list.insert(100, 3);
        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.deleteFromIndex(2));
        // list.display();
        

        // DOUBLY LINKED LIST
        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        //
        // list.insertLast(99);
        // list.insertAfter(17, 69);
        //
        // list.display();
        
        // CIRCULAR LINKED LIST
        CLL list = new CLL();

        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(49);
        list.display();
        list.delete(19);

        list.display();
    }
}
