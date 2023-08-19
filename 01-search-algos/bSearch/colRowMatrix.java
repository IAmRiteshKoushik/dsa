import java.util.Arrays;

public class colRowMatrix {

  public static void main(String[] args) {
    // Any matrix of m*n is acceptable; need not be square matrix

    int[][] matrix = {
    {10, 20, 30, 40},
    {11, 25, 35, 45},
    {28, 29, 37, 49},
    {33, 34, 38, 50}
    }; 

    // The return type is a 1D array hence it needs to be
    // converted to a string to be printed. 
    System.out.println(Arrays.toString(colRowSearch(matrix, 37)));
  }

  static int[] colRowSearch(int[][] matrix, int target){

    int r = 0;
    int c = matrix[0].length - 1;

    while (r < matrix[0].length && c >= 0){
      if(matrix[r][c] == target){
        return new int[]{r, c};
      }
      if(matrix[r][c] < target){
        r++;
      } else {
        c--;
      }
    }

    // If everything fails -- 
    // A new array object has to be created because
    // it is not a primary type but a derieved type.
    return new int[]{-1, -1};
  }
}
