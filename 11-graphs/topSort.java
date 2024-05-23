import java.util.Stack;
import java.util.ArrayList;

public class topSort {

    private static void dfs(int node, int vis[], Stack<Integer> st, 
        ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for (Integer it : adj.get(node)) {
            // If the node is not visited before run DFS recursively on it 
            // and check maximum recursion depth
            if(vis[it] == 0) {
                dfs(it, vis, st, adj);
            }
        }
        // Adding each node after visiting it in the stack
        st.push(node);
    }
    
    // Function to return list containing vertices in Topological Sorting
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < V; i++) {
            if(vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        int[] ans = new int[V];
        int i = 0;
        while(!st.isEmpty()){
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        // Write down a test-case later        
    }
}
