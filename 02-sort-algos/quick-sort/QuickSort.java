import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {

   public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
   } 

    public static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        // Start and end
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while(s <= e){
            // reason why if it is already sorted it will not swap any further
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if (s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
