class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return 
            rec1[0] < rec2[2] &&
            rec1[1] < rec2[3] &&
            rec1[2] > rec2[0] &&
            rec1[3] > rec2[1]
        ;
    }
}

// TC: O(1), SC: O(1)
// This solution is incomplete where there is a case if both triangles 
// are one and the same. In which case, we would have to make an alternate
// check if all of them hold equality at the same time or not.
