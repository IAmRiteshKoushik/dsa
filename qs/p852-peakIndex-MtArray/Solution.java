class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       if(arr.length == 3){
           return arr[1];
       }
       // Binary Search
       int l = 0;
       int h = arr.length - 1;
       int mid = l + (h - l)/2;

       while(l <= h){
           mid = l + (h - l)/2;
           if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
               return mid;
           }
           if(arr[mid] > arr[mid - 1]){
               l = mid;
           }
           if(arr[mid] > arr[mid + 1]){
               h = mid;
           }
       }
       return mid;
    }
}
