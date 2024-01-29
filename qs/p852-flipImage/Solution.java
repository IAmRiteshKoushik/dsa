class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n / 2; col++){
                int e1 = image[row][col];
                int e2 = image[row][n - 1 - col];
                if(e1 == e2){
                    image[row][col] = Math.abs(e1 - 1);
                    image[row][n - 1 - col] = Math.abs(e2 - 1);
                }
            }

            // Edge Cases : Central elements not handled (or) if array has only one element
            if(n % 2 == 1){
                image[row][n / 2] = Math.abs(image[row][n / 2] - 1);   
            } 
        }
        return image;
    }
}
