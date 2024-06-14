class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        // Create frequency distribution array
        int[] place = new int[nums.length + 1];
        for(int p: nums){
            place[p]++;
        }

        // Check for frequency 0 and 2. They are the required values.
        for(int i = 0; i < nums.length; i++){
            // If a frequency of a place is 2 then 
            // duplicate exists in that location
            if(place[i] == 2){
                result[0] = i;
            }
            // If frequency of a place is 0, then 
            // element is missing in that location
            if(place[i] == 0){
                result[1] = i;
            }
        }
        return result;
    }
}
