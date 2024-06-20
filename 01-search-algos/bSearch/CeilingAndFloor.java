public class CeilingAndFloor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        System.out.println("Index:" + bSearchCeil(arr, 15));
        System.out.println("Index:" +bSearchFloor(arr, 15));
    }
    public static int bSearchCeil(int[] arr, int target){
    // To find the smallest number, equal to or greater than target number 
    // using binary search
        int start = 0;
        int end = arr.length - 1;

        // What is target is greater than greatest element in the array
        if(target > arr[end]){
            return -1;
        }

        while(start <= end){
            // Finding middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static int bSearchFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // What is target is smaller than smallest element in the array
        if(target < arr[0]){
            return -1;
        }

        while(start <= end){
            // Finding the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                // Actually locating the element
                return mid;
            }
        }
        // If middle element is not located then return the biggest
        // number smaller than target element
        return end;
    }
}
