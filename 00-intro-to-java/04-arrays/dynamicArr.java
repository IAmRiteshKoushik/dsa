public class dynamicArr {
  public static void main(String[] args) {
    int[][] arr = {
          {1, 2, 3, 4},
          {5, 6}, 
          {7, 8, 9}
    };

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        System.out.println(arr[row][col] + " "); 
      }
      System.out.println();
    }

    // But if we wanted to create these arrays (enter inputs)
    // we have to use something called as an arrayList. This 
    // is similar to Vectors in C++. 
  }  
}
