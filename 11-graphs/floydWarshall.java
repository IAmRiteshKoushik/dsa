/**
 * floydWarshall
 */
public class floydWarshall {

    // In place-editing of the adjacency matrix
    public static void shortest_distance(int[][] matrix){
        int n = matrix.length;

        // Alter all negative ones to infinity
        
        // negative ones denoted that there was no edge between (u, v)
        // For our ease of computation we will turn them into infinities 
        // and then carry out all operations.
        
        // At the end, we will find all infinities and turn them into -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = (int)(1e9);
                }
            }
        }

        // Actual Floyd Warshall Algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], 
                        matrix[i][k] + matrix[k][j]);
                }
            }
        }

        // Converting all infinities to -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == (int)(1e9)){
                    matrix[i][j] = -1;
                }
            }
        }
        // End of function
    }
    public static void main(String[] args) {
        int[][] matrix = new int[4][4]; 
        // If there is no edge, it is represented using -1
        matrix[0][0] = 0;
        matrix[0][1] = 2;
        matrix[0][2] = -1;
        matrix[0][3] = -1;
        matrix[1][0] = 1;
        matrix[1][1] = 0;
        matrix[1][2] = 3;
        matrix[1][3] = -1;
        matrix[2][0] = -1;
        matrix[2][1] = -1;
        matrix[2][2] = 0;
        matrix[2][3] = -1;
        matrix[3][0] = 3;
        matrix[3][1] = 5;
        matrix[3][2] = 4;
        matrix[3][3] = 0;

        shortest_distance(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println(); // print a newline after each row
        }
    }
}
