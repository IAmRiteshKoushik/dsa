// Time complexity = O(n*m), Space = (1)
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
       int row=matrix.length;
       int col=matrix[0].length;

        // as our indexing begins from 0, we need to reduce by 1
       for(int i=0; i < row - 1; i++){
            for(int j=0; j < col - 1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
       } 
       return true;
    }
}
