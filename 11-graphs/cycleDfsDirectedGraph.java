public class cycleDfsDirectedGraph {

    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, 
        int[] vis, int[] pathVis){

        vis[node] = 1;
        pathVis[node] = 1;

        // traverse for adjacent nodes
        for(int it: adj.get(node)){
            // when the node is not visited
            if(vis[it] == 0){
                if(dfsCheck(it, adj, vis, pathVis) == true){
                    return true;
                }
            }
            // if the node has been previously visited 
            // but it has to visited aon the same path 
            else if(pathVis[it] == 1){
                return true;
            }
        }
        // Resetting path-visited to 0 as we are traversing back (in recursion)
        pathVis[node] = 0;
        // As cycle not found, returning false
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Initializing visited and path visited arrays
        int vis[] = new int[V];
        int pathVis[] = new int[V];

        for (int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                // Checkign for each disconnected component
                if(dfsCheck(i, adj, vis, pathVis) == true) return true;
            }
        }
        // Return false if dfsCheck fails
        return false;
    }
}
