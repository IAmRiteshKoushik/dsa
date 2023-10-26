/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Human ritesh = new Human(22, "Ritesh", 10000, false);
    Human rahul = new Human(23, "Rahul", 20000, true);
    Human arpit = new Human(43, "Arpit", 40000, false);

    System.out.println(ritesh.name);
    System.out.println(rahul.name);
    System.out.println(arpit.name);

    // Static variable (need not be accessed as part of the instance)
    // The convention is not to use the instance because static variables
    // are not dependent on the instance
    System.out.println(Human.population);
  }

  static void fun(){
    // greeting(); // cannot make static reference to a non-static method

    // How to solve the problem ?
    Main obj = new Main();
    obj.greeting();
  }

  // Non-static method can invoke another non-static method as they would
  // require an instance to be created for them to be called
  // and then the instance would be passed to the other 
  // non-static method nested inside the function code-block
  void fun2() {
    greeting();
  }

  void greeting(){
    fun(); // static methods can be called from non-static methods (but not vice-versa)
    System.out.println("Hello World");
  }
}
