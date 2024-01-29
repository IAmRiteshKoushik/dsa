class Solution {
    public int mySqrt(int x) {
        // Edge case handling
        if(x == 0){
            return 0;
        }

        int l = 1;
        int h = x / 2 + 1;    // More optimized search space
        int m = 0;
        int ans = 0; // Needed for rounding down
        while(l <= h){
            m = l + (h - l) / 2;
            if(m > x / m){
                h = m - 1;
            }else if(m < x / m){
                ans = m; // Necessary for rounding down as checking happens upwards
                l = m + 1;
            }else{
                return m;
            }
        }
        return ans;
    }
}

