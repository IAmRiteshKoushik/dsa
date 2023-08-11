import java.util.ArrayList;
import java.util.Scanner;

public class arrList {
  public static void main(String[] args) {

    // Syntax for Array List (slower than arrays)
    ArrayList<Integer> list = new ArrayList<>(10);

    // Alternate Syntax : Not Recommended
    // Best Practice : Mention the datatype to be populated
    // ArrayList list = new ArrayList<>(10);

    // NOTE : We do not use primitive datatypes in ArrayList
    // We use Wrapper Classes (Integer, String, etc ... )
    list.add(25); 
    list.add(25); 
    list.add(25); 

// You can add in as many elements as you want.
//  list.add(25);
//  list.add(25);
//  list.add(25);
//  list.add(25);
//  list.add(25);
//   list.add(25);
//   list.add(25);
//   list.add(25);
//    list.add(25);
//
//
//  list.add(25);
//  list.add(25);
//  list.add(25);
// list.add(25); 
//     list.add(25); 
//     list.add(25); 
//  list.add(25);
//  list.add(25);
//  list.add(25);
//  list.add(25);
//  list.add(25);
//   list.add(25);
//   list.add(25);
//   list.add(25);
//    list.add(25);
//
//
//  list.add(25);
//  list.add(25);
//  list.add(25);

    System.out.println(list);
    System.out.println(list.contains(25));
    list.set(0, 99);
    System.out.println(list);

  // Getting inputs
  Scanner in = new Scanner(System.in);
  
  for (int i = 0; i < 5; i++) {
    list.add(in.nextInt());
  }

  // Get item at any index
  // list[i] does not work
  for (int i = 0; i < 5; i++) {
    System.out.println(list.get(i));
  }










  }
}
