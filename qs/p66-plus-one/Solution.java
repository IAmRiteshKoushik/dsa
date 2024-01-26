import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0; // Making zeroes at the end
                continue;
            }
            digits[i]++;
            return digits;
        }

        // Edge case : [9, 9, 9] -> [1, 0, 0, 0]
        int[] newDigits = new int[digits.length + 1];
        if(digits[0] == 0){
            newDigits[0] = 1;
        }
        for(int i = 0; i < digits.length; i++){
            newDigits[i + 1] = digits[i];
        }
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] vars = plusOne(digits);
        System.out.println(Arrays.toString(vars));
    }
}
