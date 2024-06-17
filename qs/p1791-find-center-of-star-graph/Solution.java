class Solution {
    public int findCenter(int[][] edges) {
        int[] freq = new int[edges.length + 2];
        int return_val = 0;
        for(int[] edge: edges){
            

            freq[edge[0]]++;
            freq[edge[1]]++;

            // Check at every step if count goes above 1
            // only 1 node should have a frequency higher than 1
            if(freq[edge[0]] > 1){
                return edge[0];
            }
            if(freq[edge[1]] > 1){
                return edge[1];
            }
        }

        return return_val;
    }
}
