// This method works but its complexity is bad so time limit exceeds
import java.util.ArrayList;
import java.util.List;

public class Alt {
    public static void main(String[] args) {
        int[][] test = {
            {1, 2, 2, 1},
            {3, 1, 2},
            {1, 3, 2},
            {2, 4},
            {3, 1, 2},
            {1, 3, 1, 1}
        };
        List<List<Integer>> actual = new ArrayList<>(); 
        for(int[] row: test){
            List<Integer> listRow = new ArrayList<>();
            for(int element: row){
                listRow.add(element);
            }
            actual.add(listRow);
        }
        int ans = leastBricks(actual);
        System.out.println(ans);
    } 

    public static int leastBricks(List<List<Integer>> wall){
        int rows = wall.size() - 1;
        int[] idx = new int[rows + 1];

        int sum = 0; 
        for(int num: wall.get(0)){
            sum += num;
        }
        int minCrack = Integer.MAX_VALUE;
        boolean noEdges = true; 

        // We leave behind a sum of 1 because we need not check for the last 
        // column for edges as there is a permanent set of edges after that
        while(sum > 0){
            int crack = 0;
            boolean ends = false;
            for(int i = 0; i <= rows; i++){
                // For detecting edges in current iteration
                if(wall.get(i).get(idx[i]) == 0){
                    idx[i]++;   // Change to next brick
                    continue;
                }

                // If no edges were detected previously then we crack every 
                // brick in this iteration and reduce count
                if(wall.get(i).get(idx[i]) != 0 && noEdges == true){
                    wall.get(i).set(idx[i], wall.get(i).get(idx[i]) - 1);
                    crack++;
                    if(wall.get(i).get(idx[i]) == 0){
                        ends = true;
                    }
                }
                // If an edge was detected in the previous iteration then 
                // we crack every brick we do not reduce the count
                else if(wall.get(i).get(idx[i]) != 0 && noEdges == false){
                    crack++;
                }

            }
            // Finding the minimum number of cracks
            System.out.println(crack);
            if(crack < minCrack){
                minCrack = crack;
            }

            // No edges in current iteration means count can be reduced for sum
            if(noEdges == true){
                sum--;
            }
            // If any brick has encountered an end then it means that the 
            // next iteraction will experience cracks throughout without size
            // reduction of bricks
            if(ends == true){
                noEdges = false;
            } else {
                // If cracks and rows are same the it means that the entire sum 
                // can be safely reduced by one because every row has lost one 
                // point
                noEdges = true;
            }
        }
        return minCrack;
    }
}
