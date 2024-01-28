class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;    
        for(int i = 0; i < accounts.length; i++){
            int res = sumArr(accounts[i]);
            if(sum < res){
                sum = res;
            }
        }
        return sum;
    }

    private int sumArr(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
