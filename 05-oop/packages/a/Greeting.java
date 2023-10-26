package packages.a;

import packages.b.Message;
// Import statements are necessary only when you are
// importing from a different package (folder) and not
// withint the same folder

/**
 * Package
 */
public class Greeting {

  public static void main(String[] args){
    System.out.println("Hello World");
    Message.message();
  }
}
