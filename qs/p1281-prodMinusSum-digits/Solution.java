public class Solution {
    // Product of Digits - Sum of Digits
    public int prodMinusSum(int num){
        return prod(num) - sum(num);
    }

    private int prod(int num){
        if(num % 10 == n){
            return n;
        }
        return n % 10 * prod(n / 10);
    }

    private int sum(int n){
        if(num % 10 == n){
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}
