public class rotatedBSearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 8, 0, arr.length - 1));
    }

    // This method is used in arrays which are rotated. The first and second 
    // half are individually sorted but the entire array may not be sorted
    //
    // Case 1 : {1, 2, 3, 4, 5, 6};
    // Case 2 : {5, 6, 1, 2, 3, 4};
    static int search(int[] arr, int target, int s, int e){
        // Exit condition
        if (s > e){
            return -1;
        }

        // Generating middle element
        int m = s + (e - s) / 2;

        // Checking if middle element is the target element 
        if (arr[m] == target){
            return m;
        }

        // If first is lesser than the middle element, the first half of the 
        // array is sorted. (along with the middle element)
        if (arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        
        // This means that the second half of the array is sorted 
        // (along with the middle element)
        // So, we reuduce our search space to handle only the second half
        if (target >= arr[m] && target <= arr[e]){
            return search(arr,target, m + 1, e);
        }

        // Otherwise : First half of the array is sorted but middle element
        // is where second half begins hence that part of the array
        return search(arr, target, s, m - 1);
    }
}
