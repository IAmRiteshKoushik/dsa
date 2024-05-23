import java.util.Queue;

import java.util.LinkedList;
import java.util.ArrayList;

public class cycleBfs {
    public static boolean checkForCycle(int src, int V, 
        ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        
        vis[src] = true;
        // Pair works are (node, parent)
        Queue<Pair> q = new LinkedList<>();

        // Adding first element
        q.add(new Pair(src, -1));

        // Checking the queue for remaining elements
        while(!q.isEmpty()){
            int node = q.peek().first();
            int parent = q.peek().second();
            q.remove(); // after getting the node and parent (pop the pair)

            // For every node in the adjacency list
            for(int adjacentNode: adj.get(node)){
                if(vis[adjacentNode] == false){
                    vis[adjacentNode] = true;
                    q.add(new Pair(adjacentNode, node));

                // If the node has been visited and it is not the parent then 
                // someone else has visited it and that forms a cycle in the 
                // graph
                } else if (parent != adjacentNode){
                    return true;
                }

            }
        }
        // If there was a cycle then it would have been returned in the for-loop
        // but if it has not been returned in the for loop then there is no 
        // cycle in the graph
        return false;
    }
    // Function to detect cycle in an undirected graph
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){

        // Creating an array of boolean values
        boolean vis[] = new boolean[V];
        // Populating that array with false for all positions
        for(int i = 0;i < V; i++) vis[i] = false;

        // BFS traversing and checking for cycle on every node that has not been
        // visited. Suppose you have a graph that is broken down into different
        // components. Then we have to "checkForCycle" in each non-connected
        // component. For that, we have this helper function which re-starts 
        // the checkForCycle function for elements which have not been visited
        // (effectively moving over to newer components and running BFS)
        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                if(checkForCycle(i, V, adj, vis)) return true;
            }
        }
        return false;
    }

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
        boolean res = isCycle(7, adj);
        System.out.println(res);
    }
}
