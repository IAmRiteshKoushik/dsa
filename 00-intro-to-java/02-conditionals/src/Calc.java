import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        // Take input from suer till user does not press X or x
        int ans = 0;
        while(true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                else if (op == '-') {
                    ans = num1 - num2;
                }
                else if (op == '*') {
                    ans = num2 * num1;
                }
                else if (op == '/'){
                    ans = num1 / num2;
                }
                else if (op == '%') {
                    ans = num1 % num2;
                }
            } else if(op == 'x' || op == 'X') {
                break;
            } 
            else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}