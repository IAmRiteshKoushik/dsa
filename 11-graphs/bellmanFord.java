public class bellmanFord {
    // We are passing edge list and not adjacency list
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S){
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            // 10 ^ 8 = int(1e8)
            dist[i] = (int)(1e8);
        }
        // Source has to be given 0
        dist[S] = 0;

        for (int i = 0; i < V; i++) {
            for(ArrayList<Integer> it: edges){
                // Get u, v, weight
                int u = it.get(0);
                int v = it.get(1);
                int wt = it.get(2);

                if(dist[u] != 1e8 && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // N-th relaxation to check negative cycle
        for(ArrayList<Integer> it: edges){
            // Get u, v, weight
            int u = it.get(0);
            int v = it.get(1);
            int wt = it.get(2);

            if(dist[u] != 1e8 && dist[u] + wt < dist[v]){
                // If negative cycle is found then we return an array 
                // which has one element that is -1.
                int temp[] = new int[1];
                temp[0] = -1;
                return temp;
            }
        }
        return dist;
    }
}
