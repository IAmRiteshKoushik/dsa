public class topoKahn {
    public static int[] topoSortKhan(int V, ArrayList<ArrayList<Integer>> adj){

        // Creating the indegree array
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it: adj.get(i)) {
                indegree[it]++;
            }
        }

        // Adding the indegree = 0, nodes to the queue
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Array to be returned after topological sorting
        int[] topo = new int[V];
        // Iterator for the array
        int i = 0;
        // Checking until queue is empty
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo[i++] = node;
            // node is in your topological sort
            // drop it from indegree
            
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }

        // Returning the array which contains the topologically sorted node-list
        return topo;
    }
}
