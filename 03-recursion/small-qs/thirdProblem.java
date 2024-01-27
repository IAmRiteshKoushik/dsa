// Sum of digits

public class thirdProblem {
    public static void main(String[] args) {
        int ans = sumDigs(12345);
        System.out.println(ans);
    }

    static int sumDigs(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumDigs(n / 10);
    }

    static int prodDigs(int n){
        if(n % 10 == n){ // If one digit is remaining, return that digit
            return n;
        }
        return (n % 10) * sumDigs(n / 10);

    }
}
