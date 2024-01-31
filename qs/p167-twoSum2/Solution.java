import java.util.Arrays;

// Optimized solution - two pointer approach
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int i=0;
        int j=numbers.length-1;

        while(i<j){
            if(numbers[i]+numbers[j]==target){
            ans[0]=i+1;
            ans[1]=j+1;
            break;
            }
            else if(numbers[i]+numbers[j]>target)
            j--;
            else if(numbers[i]+numbers[j]<target)
            i++;
        }
        return ans;
    }
}

// Brute Force
class Solution{
    public static int[] twoSum(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(i + "," + j);
                if(numbers[i] + j == target){
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
