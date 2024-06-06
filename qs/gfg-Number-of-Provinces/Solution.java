//User function Template for Java
import java.util.ArrayList;

class Solution {
    // Depth first search method
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, 
    int[] vis){
        vis[node] = 1;
        for(Integer it: adj.get(node)){
            if(vis[it] == 0){
                dfs(it, adj, vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // Change the adjacency matrix to adjacency list and then perform dfs operation
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < V; i++){
            adjLs.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(adj.get(i).get(j) == 1 && i != j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        
        // Initialize visited array
        int[] vis = new int[V];
        // Need to keep count of each dfs call
        int count = 0;
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                count++;
                dfs(i, adjLs, vis);
            }
        }
        
        // Number of provinces == number of dfs calls because 
        // each dfs call finds all the cities in a province
        // (all nodes of a connected component)
        return count;
    }
};
