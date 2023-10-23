import java.util.Arrays;

/**
 * introduction
 */
public class introduction {

  public static void main(String[] args) {

    // store 5 roll numbers
    int[] numbers = new int[5];

    // store 5 names
    String[] names = new String[5];

    // Store 5 marks
    float[] marks = new float[5];

    // But if we had to create a datatype where-in each occurence of the datatype
    // would include the above following data in the format of :
    // (22038, 'Ritesh', 8.5);

    // Basically, create your own DATATYPE
    Student[] students = new Student[5];

    // Just declaring -- not populated with data
    Student ritesh = new Student(22, "Ritesh Koushik", 88.5f); 
    
    // -- WITHOUT CLASS CONSTRUCTOR
    // ritesh.rno = 22;
    // ritesh.name = "Ritesh Koushik";
    // ritesh.marks = 88.5f;

    System.out.println(ritesh); // shows the memory location at which it is stored

    // If not populated with data, it takes the default values
    System.out.println(ritesh.rno); // default = 0
    System.out.println(ritesh.name); // default = null
    System.out.println(ritesh.marks); // default = 0.0
    
    
    ritesh.changeName("Sitesh Koushik"); 
    System.out.println(ritesh.name);
    // System.out.println(Arrays.toString(students));
    
    // Passing a class as an argument to another class's constructor
    Student random = new Student(ritesh);
    System.out.println(random.name);
  }
}

// Create a public
// A class is just a name of a collection of properties and functions
// It is a template for an object
// An object is an instance of a class

// Class is only a logical construct
// Object is the physical reality
class Student {
  int rno;
  String name;
  float marks;

  // Constructor
  Student(){
    this.rno = 12;
    this.name = "Hello Peter";
    this.marks = 99;
  }
  // Constructor Overloading - Depends on the parameters
  Student(int rno, String name, float marks) {
    this.rno = rno;
    this.name = name;
    this.marks = marks;
  }
  // More Overloading
  Student (Student other){
    this.name = other.name;
    this.rno = other.rno;
    this.marks = other.marks;
  }

  // Effectively we have made multiple constructors to initalize 
  // one class. This becomes helpful in instantiating classes.
  // Also, there is no return type because the class itself it returned
  // after the constructor does its job. 


  // Methods
  void greeting() {
    System.out.println("Hello! My Name is " + name);
  }

  // Change Name
  void changeName(String newName){
    this.name = newName;
  }

  // New greeting (using this. keyword)
  void greeting2(){
    System.out.println("Hello! My name is " + this.name);
  }
}
