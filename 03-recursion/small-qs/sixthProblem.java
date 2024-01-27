public class sixthProblem {
    // Count the number of zeroes in an integer
    public static void main(String[] args) {
        int ans = countZeroes(302010);
        System.out.println(ans);
    }

    static int count = 0;
    static int countZeroes(int num){
        if(num == 0){ // Base condition
            return count;
        }

        int rem = num % 10; // Programming logic
        if (rem == 0) {
           count++; 
        }
        return countZeroes(num / 10); // Recursion call
    }
}
