// The Main.java file is stored in ritesh/ directory which in turn
// is stored in the com/ directory of the src/ directory as
// all source code goes inside src/ and inside src/ we split things
// based on rules + programming requirements and call them 
// "packages"
package com.ritesh;

// Importing a Sanner for taking in input
// (this does not come be default)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // -- Output in Java
        System.out.println("Hello World!");
        // The creators of Java have designed a package called 'lang'
        // Which gets imported be default when we write a Java 
        // program and comes in with a set of built-in functions
        // and classes. 

        // The System package has a variable called "out" which is 
        // initialized to NULL when the program begins. This variable
        // is of the type PrintStream (more coming up ... ). Out is
        // just a reference variable for PrintStream as it is not
        // possible to type PrintStream everytime as the syntax would
        // get even longer. There are some more nuances to it which 
        // go beyond the explaination for the moment. 

        // println() is a function which takes in a string and prints
        // that out to the console which is followed by adding a new line
        // . We can check the documentation of 
        // this function by holding Ctrl + Click. 

        // println() is part of the PrintStream.class;
        // Now, PrintStream is what we use to actually use to generate
        // output stream of text to the console. The println() function
        // acts only as an intermediatery for that to happen by
        // abstracting away a lot of the complexity of the original
        // class. 

        // -- Input in Java
        Scanner input = new Scanner(System.in);
        // The system package has a variable called "in" which is 
        // initialized to NULL when the program begins. This variable 
        // is of the type InputStream. 

        // Now that we have created the input as an instance of Scanner
        // class, we can use that to take inputs from the keyboard
        
        // -- input types
        // System.out.println(input.nextInt());
        // System.out.println(input.next());
        System.out.println(input.nextLine());
        
        input.close();
        // NOTE : There is a resource leak here which is pointed out
        // by some of the code editors. The way we instantiated the input
        // object, we must close it as well. Recall how fileStreams are
        // closed in other languages such as Python or C. 
        
        // NOTE : Inputting can be done not only from the
        // terminal/standard input stream(console) but can also 
        // be done from a file using a FileStream()
        
    }
}

