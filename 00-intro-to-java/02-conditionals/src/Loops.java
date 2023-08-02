import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // For Loop
        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }

        // Custom for loop
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 0; num <= n; num++) {
            System.out.print(num + " ");
        }

        // While Loop
        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }

        in.close();
    }
}