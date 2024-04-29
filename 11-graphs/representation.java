import java.sql.Array;
import java.util.ArrayList;

public class representation {
    public static void main(String[] args) {
        // 3 nodes and 3 edges
        int n = 3, m = 3;
        int adj[][] = new int[n+1][n+1];

        // Edge 1 --- 2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // Edge 2 --- 3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // Edge 1 --- 3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // This is how we are storing values inside matrix
        // But this operation is being costly
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
}

class alternate {
    public static void main(String[] args) {
        int n = 3, m = 3; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // n + 1 empty arraylists have been added
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>()) ;
        }
        // The aim is to append the neighbouring values of each element into
        // the arrayList.
        adj.get(u).add(v);
        adj.get(v).add(u);

        // If the graph is directed, then you only add u --> v and not v --> u

        // Edge 1 --- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge 2 --- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge 1 --- 3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Printing out the entire arrayList
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.println(adj.get(i).get(j) + " ");
            } 
            System.out.println();
        }
    }
}

