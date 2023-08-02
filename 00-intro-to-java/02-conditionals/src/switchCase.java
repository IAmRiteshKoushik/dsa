import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String fruit = in.next();
       
       switch (fruit) {
        case "Mango":
            System.out.println("King of fruits");
            break;
        case "Apple":
            System.out.println("A sweet red fruit");
            break;
        case "Orange":
            System.out.println("Round fruit");
            break;
        case "Grapes":
            System.out.println("Small fruit");
            break;
        default:
        // If default is mentioned in the beginning or in between 
        // the switches then we would have to mention a break condition
        // as the "case" word is just like a label and is eliminating
        // blocks of code based on case-fails. 
            System.out.println("Please enter a valid fruit");


            
        // Alternate Syntax
        /*
         * switch (fruit) {
         * case "Mango" -> System.out.println("King of fruits");
         * case "Apple" -> System.out.println("A sweet red fruit");
         * case "Orange" -> System.out.println("Round fruit");
         * case "Grapes" -> System.out.println("Small fruit");
         * default -> System.out.println("Please enter a valid fruit.");
         * }
         */
       }

       in.close();
    }
}