public class firstArray {
  public static void main(String[] args) {

    // datatype[] variable = new datatype[size]
    int[] rnos = new int[5];
        // The "new" keyword is used to create an object from a class. 
        // Also, by default, Java initializes a zero array after
        // dyanmically allocating memory for it. 

    // On the LHS we have the declaration of array

        // On the RHS, we have the actual memory allocation
        // The object is being created in the heap memory
        // You can also call it as "initialization step"

    // -- Alternate Way of Understanding
        // LHS tells the datatype of the identifier
        // RHS is the instance of array-declaration class
        // RHS -- creates the object in Heap Memory

    // Java documentation says that objects stored in "heap memory" are not 
        // continuous in nature. Hence, even though the definition of array says
        // that it is a continuous stream of data. In Java, that may not be true. 
        // https://stackoverflow.com/questions/10224888/java-are-1-d-arrays-always-contiguous-in-memory
    
        // LHS is executed in compile 14:28
        // RHS is executed in Run-Time (Dyanamic Memory Allocation)



    // The same declaration can also be done as the following:
        // int[] ros;
        // ros = new int[];
           // int rnos = {2:q3, 12, 45, 32, 15};
    
 
    // Trying to create character array (String)
    String[] arr = new String[4];
    System.out.println(arr[3]);
    int num;
    // System.out.println(num);
        // Here, if we try to print the character at any position, we would get NULL
        // That is because string-array is initialized with NULL values in the 
        // beginning post dynamic memory allocation. 

    // Properties of NULL :
    // 1 - NULL cannot be assigned to any primitive
        // eg: String[] arr = null; // works
        // eg: int num = null; // does not works
        // This is because int is a primitive datatype but String[] is not!
    // 2 - NULL is not a datatype; it is a literal
  }
}
