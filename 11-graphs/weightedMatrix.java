/**
 * weightedMatrix
 */
public class weightedMatrix {

    public static void main(String[] args) {
        int n = 5, m = 5;
        int adj[][] = new int[n+1][n+1];

        // Edge 1-2
        adj[1][2] = 2;
        adj[2][1] = 2;

        // Edge 1-3
        adj[1][3] = 3;
        adj[3][1] = 3;

        // Edge 2-4
        adj[2][4] = 1;
        adj[4][2] = 1;

        // Edge 1-3
        adj[3][4] = 4;
        adj[4][3] = 4;

        // Edge 4-5
        adj[4][5] = 3;
        adj[5][4] = 3;

        for (int i = 0; i < adj.length; i++) {
           for (int j = 0; j < adj[i].length; j++) {
                System.out.print(adj[i][j] + " "); 
            } 
            System.out.println("");
        }
    }
}
