class Solution {
    public int findPeakElement(int[] num) {
        if(num.length == 1){
            return 0;
        }
        if(num.length == 2){
            if(num[0] > num[1]) return 0;
            return 1;
        }

        int start = 0;
        int end = num.length - 1;

        while(start < end){
            // this loop will break when start == end
            int mid = start + (end - start) / 2;
            if(num[mid] > num[mid + 1]){
                // you are in the first half of the array
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // or end
    }
}
