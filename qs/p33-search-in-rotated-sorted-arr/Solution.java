public class Solution {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }

    int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you did not find a pivot, it menas the array is not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found, then you have 2 ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        // reducing the search space
        // if target is greater than the first number then it lies in first 
        // half of the array
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // if target is lesser than the first number then it lies in second 
        // half of the array
        return binarySearch(nums, target, pivot + 1, nums.length - 1)
    }

    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // case 1:
            if(mid < end && arr[mid] > arr[mid + 1]){
                return  mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid  = start + (end - start) / 2;
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

    // Miscellaneous problem
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // if elements are middle, start and end are equal then just skip 
            // the duplicates.
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates

                // NOTE: what if these elements at start and end were the pivots ?
                // check if start is pivot ?
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check if end -1 is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // In-order to find the count of rotation we need to find the index of pivot 
    // and add it with 1
    static int RotationCount(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1; // if array is not rotated then pivot = -1 and it will become 0 
    }
}
