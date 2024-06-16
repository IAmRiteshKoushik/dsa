// Fastest solution uses QuickSort()

// Slower solutions use BubbleSort()
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Bubble sort + Double swapping
        int n = heights.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                // Swapping logic
                if(heights[j] < heights[j + 1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;

                    String temp2 = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp2;
                }
            }
        }
        return names;
    }
}
