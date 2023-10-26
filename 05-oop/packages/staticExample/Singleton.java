/**
 * Singleton
 */
public class Singleton {

  // Default Constructor is made private
  private Singleton(){
  }

  // Creating a private instance inside the class
  private static Singleton instance;

  public static Singleton getInstance() {
    // check whether 1 obj only is created or not
    if (instance == null){
      instance = new Singleton();
    }

    return instance;
  }
}
