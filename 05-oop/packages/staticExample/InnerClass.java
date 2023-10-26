public class InnerClass {

  // This is an inner class (it is a class within a class)
  static class Test {
    String name;

    public Test(String name){
      this.name = name;
    } 
  }

  public static void main(String[] args) {
    Test a = new Test("Kunal");
    Test b = new Test("Ritesh");

    System.out.println(a.name);
    System.out.println(b.name);
  }
}
