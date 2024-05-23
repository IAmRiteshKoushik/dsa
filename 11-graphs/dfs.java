public class dfs {
    public static void dfs(int node, boolean vis[], 

        ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        // marking current node as visited
        vis[node] = true;
        ls.add(node);

        // getting neighbour nodes
        for(Integer it: adj.get(node)){
            if(vis[it] == false){
                dfs(it, vis, adj, ls);
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){

        // Setting up visited array
        boolean vis[] = new boolean[V + 1];
        vis[0] = true; // 1-based indexing, marking the first one to be true
        
        // List to store the entire DFS traversal order
        ArrayList<Integer> ls = new ArrayList<>();
        // Calling DFS 
        dfs(0, vis, adj, ls);
        return ls;
    }

    public static void main(String[] args) {
        // sample adjacency list
    }

}
