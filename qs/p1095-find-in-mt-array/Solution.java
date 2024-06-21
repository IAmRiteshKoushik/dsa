public class Solution {
    public static void main(String[] args) {
        
    }

    // search in mountain array
    public int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearchRev(arr, target, peak + 1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int target, int[] mtArr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Alternatively, you can use orderAgnostic binary search algorithm 
    // instead of the following two functions
    public int binarySearch(int[] arr, int target, int start, int peak){
        int end = peak;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchRev(int[] arr, int target, int start, int peak){
        int end = peak;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                end = mid - 1;
            } else if (arr[mid] > target){
                start = mid + 1;
            }
        }
        return -1;
    }

}
