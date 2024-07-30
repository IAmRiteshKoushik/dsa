import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SubSet
 */
public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetWithDuplicates(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetWithDuplicates(int[] arr){
        Arrays.sort(arr);   // sorts the original array
        List<List<Integer>> outer = new ArrayList<>();
        // Adding a blank
        outer.add(new ArrayList<>());

        // We need to maintain start and end pointers before each iteration
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = 0;
            // if current and previous element is same, s = e + 1
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        // Adding an empty array-list
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                // Fetching the list from outer
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // Adding an element into it
                internal.add(num);
                // Adding the list into outer
                outer.add(internal);
            }
        }
        return outer;
    }
}
