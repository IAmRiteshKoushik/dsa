// If the name of the file is Main.java, then the class main is going to be a "public" class. 
// In Java, everything is a class. There are public classes and private classes.

public class Main{
    // A class is just a named group of properties and functions. More on this in OOP.
    public static void main(String[] args) {
        // The main function is where the execution of the program begins. 
        // It makes sense to have this function as a public function as this
        //  is the entry point. 

        // We have the 'static' keyword because, static-methods are methods
        // which belong to the class rather than an instance of the class.
        // Static methods are also called as class-methods because they can
        // be called without creating the class object. 

        // Now, it is a void function because it does not have any return()

        // The command line arguments can be passed in when calling the main()
        // function. Whatever we pass while writing - java Main <string-list>
        // That is accepted as a string argument and can be accessed by the 
        // code block inside the main() function. 

        // System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
