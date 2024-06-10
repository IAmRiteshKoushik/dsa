import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

class Pair{
    int node;
    int distance;
    public Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}

public class dijkstra {

    // Function to find the shortest distance of all vertices from the source
    // vertex "S"
    // We need to store edges as well now hence the triple nesting of arrayLists
    static int[] dijkstraAlgo(int V, 
        ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){

        // min-heap
        // Priority queue is getting a function comparator in-order to give priority
        // to lesser distance first and then to lesser node value
        Comparator<Pair> comparator = new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2){
                // Integer.compare() returns:
                // 0: equal value
                // 1: int1 > int2
                // -1: int1 < int2
                int compareX = Integer.compare(p1.distance, p2.distance);
                if (compareX != 0){
                    return compareX;
                }
                // if X values are equal, prioritize lower y value
                return Integer.compare(p1.node, p2.node);
            }
        };
        PriorityQueue<Pair> pq = new PriorityQueue<>(comparator);
        // Everytime an element is added, it is compares against the minimum 
        // element assigned by the min-heap. If the comparator gives a value 
        // -1 -> we get new minimum
        // 1 -> we do not get new minimum but it is appropriately inserted 
        //      where the condition fails
        //  0 -> insertion happens (algo avoids such cases)

        // ALTERNATE APPROACH -> inline comparator function
        // PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);

        int[] dist = new int[V];
        // 1e9 is 10 raised to the power of 9 .. it is a very big number to 
        // represent the infinity part
        for(int i = 0; i < V; i++) dist[i] = (int)(1e9);

        // A node traverses zero distance to reach itself, hence 0
        dist[S] = 0;
        // Adding that by default to the priority queue
        pq.add(new Pair(0, S));

        while(pq.size() != 0){
            // Getting the required values and remove an element from the
            // priority queue
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            // 
            for(int i = 0; i < adj.get(node).size(); i++){
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if(dis + edgeWeight < dist[adjNode]){
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
}
