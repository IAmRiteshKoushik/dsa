

// Brute Force Solution
class Solution {
    public static int oddCells(int m, int n, int[][] indices) {
       int[][] matrix = new int[m][n]; // Declaring the array
       for(int[] pair: indices){
           int row = pair[0];
           int col = pair[1];
           
           // row upgrade
           for(int i = 0; i < n; i++){
               matrix[row][i]++;
           }
           // col upgrade
           for(int i = 0; i < m; i++){
               matrix[i][col]++;
           }
       }
       // After all upgrades
       return countOdd(m, n, matrix);
    }

    private static int countOdd(int m, int n, int[][] matrix){
        int odd = 0;
       for(int i = 0; i < m; i++){
           for(int j = 0; j < m; j++){
               if(matrix[i][j] % 2 != 0){
                   odd++;
               }
           }
       }
       return odd;
    }

    public static void main(String[] args) {
        int[][] indices = {
            {0, 1},
            {1, 1},
        };
        int ans = oddCells(2, 3, indices);
        System.out.println(ans);
    }
}
