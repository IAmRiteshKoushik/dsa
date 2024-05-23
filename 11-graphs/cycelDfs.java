import java.util.ArrayList;

public class cycelDfs {
    // Depth first search algorithm
    private static boolean dfs(int node, int parent, int[] vis, 
        ArrayList<ArrayList<Integer>> adj){

        // Make the node visited
        vis[node] = 1;

        // For all its neighbours
        for (int adjacentNode: adj.get(node)) {
            // If the node has not been visited before
            if(vis[adjacentNode] == 0) {
                // Recursion call to adjacentNode for DFS
                if(dfs(adjacentNode, node, vis, adj) == true){
                    return true;
                }
            // If the node has been visited before and it is not a parent
            } else if (adjacentNode != parent) return true;
        }
        return false;
    }

    // Function to detect cycle in an undirected graph
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];
        for (int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                // The graph's first element does not have a parent so we randomly
                // assign -1 to be the parent.
                if(dfs(i, -1, vis, adj) == true) return true;
                // But if the graph is broken into multiple disjoint components
                // the too there is not parent and we need to assign -1 to parent
            }
        }
        return false;
    }

    // TestBED for Cycle Detection using DFS
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        ArrayList<Integer> a5 = new ArrayList<>();
        ArrayList<Integer> a6 = new ArrayList<>();
        ArrayList<Integer> a7 = new ArrayList<>();
        ArrayList<Integer> a8 = new ArrayList<>();

        a2.add(2);
        a2.add(3);

        a3.add(1);
        a3.add(5);

        a4.add(1);
        a4.add(4);
        a4.add(6);

        a5.add(3);

        a6.add(2);
        a6.add(7);

        a7.add(3);
        a7.add(7);

        a8.add(5);
        a8.add(6);

        // Adding in all the lists
        adj.add(a1); // {}
        adj.add(a2); // {2, 3}
        adj.add(a3); // {1, 5}
        adj.add(a4); // {1, 4, 6}
        adj.add(a5); // {3}
        adj.add(a6); // {2, 7}
        adj.add(a7); // {3, 7}
        adj.add(a8); // {5, 6}
        boolean res = isCycle(8, adj);
        System.out.println(res);
    }

}
