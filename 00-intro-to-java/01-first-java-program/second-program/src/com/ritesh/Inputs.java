package com.ritesh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.print("Please enter some input: ");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();

        // "int" is the variable type
        // "rollno" is the identifier
        // "input.nextInt()" is the literal (int-literal)
        System.out.println("Your roll number is " + rollno);

        // Also an interesting way to represent numbers especially 
        // currencies is by using underscores
        int a = 234_000_000;
        System.out.println(a);

        // Taking String Inputs
        System.out.println("Enter your full name:");
        String name = input.next();
        // .next() prints out the part of the string from the first till
        // the next separator character. 
        System.out.println("Enter your full name again:");
        String fullName = input.nextLine();
        // .nextLine() prints out the part of the string from the place
        // where printing stopped earlier and then prints out the whole data.
        // It is very similar to reading a file using a file pointer. 

        // NOTE :
        // A system prompts for the input only when the input variable
        // is empty. If there is buffer data in the variable, it prints 
        // out that data. 

        System.out.println("#######################");
        System.out.println(name);
        System.out.println(fullName);

        // Resource leak
        input.close();
    }
}