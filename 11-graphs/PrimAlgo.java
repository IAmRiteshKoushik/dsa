import java.util.PriorityQueue;
import java.util.ArrayList;

class Pair{
    int node;
    int distance;

    public Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}

/**
 * PrimAlgo
 */
public class PrimAlgo {

    // Function to find the weights of edes of the Minimum Spanning Tree
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        // Create a custom comparator for ordered pairs
        Comparator<Pair> comparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                // prioritize lower x value
                int compareX = Integer.compare(p1.x, p2.x);
                if (compareX != 0) {
                    return compareX;
                }
                // if x values are equal, prioritize lower y value
                return Integer.compare(p1.y, p2.y);
            }
        };

        // Create the priority queue with the custom comparator
        PriorityQueue<Pair> queue = new PriorityQueue<>(comparator);

        int[] vis = new int[V];
        // {wt, node}
        pq.add(new Pair(0, 0));
        int sum = 0;
        while(pq.size > 0){
            // priority queue will always give out the one with lowest weight
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            // if already visited then continue
            if(vis[node] == 1) continue;

            // if not visited, add it to the MST
            vis[node] = 1; // mark it visited
            sum += wt; // add the sum

            for(int i = 0; i < adj.get(node).size(); i++){
                int edW = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                
                if(vis[adjNode] == 0){
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }
}

// If there is a requirement to send back the entire edgeList for generating the 
// MST then you need to store the parent otherwise there i snot need
// "sum" is enough
