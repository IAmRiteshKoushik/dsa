/**
 * BSearch-InfiniteArr
 */
public class BSearchInfiniteArr {

   public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        // 100 cannot be searched as we reach out of bounds error but this will 
        // not happen in case of infinite array as there is no outOfBounds there.
        // int target = 100;
        System.out.println(ans(arr, target));
   } 

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            // double the range
            // end = previous + boxValue
            end = end + (end - start + 1) * 2;
            // as we are using start to determine the end, we must not 
            // change it in the previous step and instead have it inside a 
            // temporary variable
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            // find the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
