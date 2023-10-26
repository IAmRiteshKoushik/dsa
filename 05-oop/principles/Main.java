package principles;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Box box1 = new Box();
    // Box box2 = new Box(4.6, 7.9, 9.9);
    // Box box3 = new Box(box2);

    // System.out.println(box1.l + " " + box1.w + " " + box1.h);
    // System.out.println(box2.l + " " + box2.w + " " + box2.h);
    // System.out.println(box3.l + " " + box3.w + " " + box3.h);
    
    // BoxWeight box3 = new BoxWeight();
    // BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
    // System.out.println(box3.h + " " + box3.weight);


    // PROBLEM 01
    // Box box5 = new BoxWeight(2, 3, 4, 5);
    // System.out.println(box5.weight);
    // Trying to access th property of a 


    // PROBLEM 02
    // BoxWeight box6 = new Box(2, 3, 4); // Box cannot be converted into BoxWeight
    // System.out.println(box6);
    //
    // Reason :
    // There are many variables in both parent and child classes.
    // You are given access to variables that are in the ref type i.e BoxWeight
    // hence, you should have access to weight variable
    // this also means, that the ones you are trying to access should be initialised
    // but here, when the object iteself is of type : parent public class Main {
    // how will you call the constructor of the parent class
    // HENCE ERROR! 

  }
}
