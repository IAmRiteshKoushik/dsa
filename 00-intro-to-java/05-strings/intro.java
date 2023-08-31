

public class intro {

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5, 6};
    int a = 10;

    // Strings are the most commonly used classes in Java 
    // (recall class names begin with Capital letters in Java {convention})
    // datatype : reference_variable = actual_data;
    String name = "Ritesh Koushik";
    System.out.println(name);


    // Question 01 - How are strings being handled in memory ?
    // Suppose :
    // String name1 = "Ritesh";
    // String name2 = "Ritesh";
    
    // Are the pointing to the same string ?
    // Answer 01 : (to be given shortly)

    // Concept - String-pool and Immutability
    // All strings are stored inside the heap memory under a bracket called 
    // "string-pool". The string pool stores strings that are unique. 

    // In the previous question name1 and name2 point to the same string from
    // the string-pool. 
  }
}
