/**
 * final
 */
public class finalKeyWord {

  public static void main(String[] args) {
    // The final keyword (alternative to const in Java)
    final int INCREASE = 10; // has to always be initialized
    // INCREASE = 20; // cannot be changed

    // However this is only applicable for primitive datatypes
    // When a non primitive is final, you cannot reassign, but values can be changed
    final A ritesh = new A("Ritesh Koushik");
    kunal.name = "new name"; // this is allowed
  }

  class A {
    final int num = 10;
    String name;

    public A(String name){
      this.name = name;
    }
  }
}
