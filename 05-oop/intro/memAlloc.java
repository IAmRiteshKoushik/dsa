/**
 * memAlloc
 */
public class memAlloc {

  public static void main(String[] args) {

    Random variable = new Random("Ritesh");
    Random variable2 = variable;
    variable.name = "Not Ritesh";
    System.out.println(variable2.name);

  }

  class Random{
    String name;

    Random(String name){
      this.name = name;
    }
  }
}
