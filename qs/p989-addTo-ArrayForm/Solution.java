import java.util.Collections;

// Similar Apprach
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = k;

        List<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0 || carry > 0; i--) {
            int sum = carry;
            if (i >= 0) {
                sum += num[i];
            }
            result.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(result);
        return result;
    }
}


// My Brute Force Solution
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // List is an interface which agrees with ArrayList, Vector and Stack
        List<Integer> list = new ArrayList<Integer>();    
        int carry = 0; 

        // Iterating from the end of the list
        for(int i = num.length - 1; i >= 0; i--){
            int sum = num[i] + (k % 10) + carry;
            carry = sum / 10;
            list.add(0, sum % 10);
            k = k / 10; // Reducing k
        }
        while(carry != 0 || k != 0){
            carry = carry + (k % 10);
            list.add(0, carry % 10);
            k = k / 10;
            carry = carry / 10;
        }

        return list;
    }
}
