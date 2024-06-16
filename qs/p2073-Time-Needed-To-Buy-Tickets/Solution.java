// My solution
public class Solution{
    public int timeRequiredToBuy(int[] tickets, int k){
        int total = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i > k){
                // 1 less iteration will happen for people after k-th person
                total += Math.min(tickets[k] - 1, tickets[i]);
            } else {
                // usual number of iterations for people before k-th person
                total += Math.min(tickets[k], tickets[i]);
            }
        } 
        return total;
    }
}
// Brute Force Approach
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum = 0;
        
        while(tickets[k] != 0){
            for(int t = 0; t < tickets.length; t++){
                if(tickets[t] != 0){
                    tickets[t]--;
                    sum++;
                }
                // while solving if k = 0, then stop solving
                if(tickets[k] == 0){
                    break;
                }
            }
        }

        return sum;
    }
}
