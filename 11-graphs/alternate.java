import java.util.ArrayList;

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
        // adj.get(u).add(v);
        // adj.get(v).add(u);

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
        for (int i = 0; i <= n; i++) {
            System.out.print(i + "th adj.list contains -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            } 
            System.out.println();
        }
    }
}

