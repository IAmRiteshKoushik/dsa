import java.util.Arrays;

public class bSearchTwoD {
  public static void main(String[] args) {
  int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {13, 14, 15, 16}
    }; 
    
    System.out.println(Arrays.toString(search(matrix, 14)));
  }

  // BINARY SEARCH (1D)
  // Search in the row provided 
  static int[] bSearch(int[][] matrix, int row, int cStart, int cEnd, int target){
    while (cStart <= cEnd) {
      int mid = cStart + (cEnd - cStart)/2;

      // If element is located then return coordinates 
      if(matrix[row][mid] == target){
        return new int[]{row, mid};
      }
      else if(matrix[row][mid] < target){
        cStart = mid + 1;
      } else {
        cEnd = mid - 1;
      }
    }

    // If element is not found  
    return new int[]{-1, -1};
  }

  // BINARY SEARCH (2D)
  static int[] search(int[][] matrix, int target){
    int rows = matrix.length;
    int cols = matrix[0].length; // be cautious, matrix may be empty

    if (rows == 1){
      return bSearch(matrix, 0, 0, cols-1, target);
    }

    int rStart = 0;
    int rEnd = rows - 1;
    int cMid = cols / 2;  // a central column for making comparisons

    // run the loop till 2 rows are remaining
    while (rStart < (rEnd - 1)) { // while this is true, there would be two rows remaining
      int mid = rStart + (rEnd - rStart) / 2;
      if (matrix[mid][cMid] == target){
        return new int[] {mid, cMid};
      }
      if (matrix[mid][cMid] < target){
        rStart = mid;
      } else {
        rEnd = mid;
      }
    }

    // now we have two rows remaining
    // check whether the target is in the middle columns of 2 rows
    if (matrix[rStart][cMid] == target){
      return new int[]{rStart, cMid};
    }
    if (matrix[rStart + 1][cMid] == target){
      return new int[]{rStart + 1, cMid};
    }

    // If element is not in the those cells

    // search in 1st half
    if(target <= matrix[rStart][cMid - 1]){
      return bSearch(matrix, rStart, 0, cMid - 1, target);
    }
    // search in 2nd half
    else if (target >= matrix[rStart][cMid - 1] && target <= matrix[rStart][cols - 1]) {
      return bSearch(matrix, rStart, cMid + 1, cols - 1, target); 
    }
    // search in 3rd half
    else if (target <= matrix[rStart + 1][cMid - 1]){
      return bSearch(matrix, rStart + 1, 0, cMid - 1, target );
    }
    // search in 4th half
    else {
      return bSearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }
  }
}
