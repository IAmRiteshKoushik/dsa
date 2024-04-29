import java.util.ArrayList;
import java.util.Queue;

public class bfs {
    // Function inputs : Int(value) and ArrayList<ArrayList<Integer>>(adj-list)
    // Function outputs : ArrayList<Integers>
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;
    }
}
