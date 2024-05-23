import java.util.ArrayList;
import java.util.Queue;

public class bfs {
    // V is the number of elements in a graph, adj is the adjacency list
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        // Return the order of visiting elements
        ArrayList<Integer> bfs = new ArrayList<>();
        // Visited array
        boolean vis[] = new boolean[V];
        // Maintaining a queue for traversal
        Queue<Integer> q = new LinkedList<>();

        // Assuming 0-based indexing in graph
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            // Queueing and adding things to the bfs return arrayList
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued value
            // If adjacent has not been visited, then make it
            // visited and enqueue it
            for(Integer it: adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;
    }
    public static void main(String[] args) {
        
        // Sample adjacency list
        ArrayList<Integer> res = bfsOfGraph();
    }
}
