/**
 * Human
 */
public class Human {

  int age;
  String name;
  int salary;
  boolean married;

  static long population;

  static void message(){
    System.out.println("Hello World");
    // System.out.println(this.age); // Cannot use this in a static context
  }

  public Human (int age, String name, int salary, boolean married) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.married = married;

    // Static variables are independent of the instances as they are only created once
    // in memory. While you can access them using the "this" keyword, it is better
    // to refer to them directly by using the name of the class. 
    Human.population += 1;
  }

}


