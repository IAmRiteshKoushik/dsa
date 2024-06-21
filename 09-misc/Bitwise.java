public class Bitwise {
    public static void main(String[] args){
        int n = 67;
        System.out.println(isOdd(n));
        magicNum(5);
        System.out.println(NoOfDigitsInBaseN(6, 2));
        System.out.println(isPowerOfTwo(16));
        findPower(2, 6);
        System.out.println(setBits(5));

        // WHile these problems can be solved iteratively too 
        // they would generate time-limit exceeded and hence 
        // they must not be used.
        System.out.println(findXOR(6));
        System.out.println(findXORBetweenAandB(2, 6));
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    public static void magicNum(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            // Last digit * 5^(something)
            ans += last * base; 
            // Upgrading the base - 5, 25, 125, ...
            base = base * 5;
        }
        System.out.println(ans);
    }

    public static int NoOfDigitsInBaseN(int n, int b){
        // Java can calculate log only in base 10 so we use 
        // the logarithmic property of log N to base a = log N / log a
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        return ans;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n - 1)) == 0;
    }

    public static void findPower(int base, int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }

    public static int setBits(int n){
        int count = 0;
        
        while(n > 0){
            // Upgrade if right-most bit is 1
            if((n & 1) == 1){
                count++;
            }
            // Right shift
            n = n >> 1;
        }
        return count;
    }

    public static int setBitsAlt(int n){
        int count = 0;

        while(n > 0){
            count++;
            n -= (n & -n); // OR n = n & (n - 1)
        }
        return count;
    }

    public static int findXOR(int n){
        switch (n % 4){
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            case 3:
                return 0;
        }

        // Default return value
        return -1;
    }

    public static findXORBetweenAandB(int a, int b){
        return findXOR(a) ^ findXOR(b);
    }
}
