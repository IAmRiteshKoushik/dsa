import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[][] test = {
        {1, 2, 2, 1},
        {3, 1, 2},
        {1, 3, 2},
        {2, 4},
        {3, 1, 2},
        {1, 3, 1, 1}
        };
        List<List<Integer>> actual = new ArrayList<>(); for(int[] row: test){
            List<Integer> listRow = new ArrayList<>();
            for(int element: row){
                listRow.add(element);
            }
            actual.add(listRow);
        }
        int ans = leastBricks(actual);
        System.out.println(ans);
    } 

    // Efficient solution
    public static int leastBricks(List<List<Integer>> wall){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < wall.size(); i++){
            List<Integer> row = wall.get(i);
            int sum = 0;
            for(int j = 0; j < row.size() - 1; j++){
                sum += row.get(j);
                if(!hm.containsKey(sum)){
                    hm.put(sum, 1);
                } else {
                    hm.put(sum, hm.get(sum) + 1);
                }
            }
        }
        int max = 0;
        for(int key: hm.keySet()){
            if (hm.get(key) > max){
                max = hm.get(key);
            }
        }
        return wall.size() - max;
    }
}
