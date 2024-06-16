class Solution{
    public int countStudents(int[] students, int[] sandwiches) {

        // Number of students who prefer either sandwich type
        int[] preferences = new int[2];
        for(int std: students){
            preferences[student]++;
        }

        // Removing sandwich from preference array
        for(int sandwich: sandwiches){
            if(preferences[sandwich] == 0){
                // if no more students prefer this type of sandwich
                break;
            }
            preferences[sandwiches]--;
        }

        return preferences[0] + preferences[1];
    }
}
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Students queue
        Queue<Integer> queue = new LinkedList<>();
        for(int num: students){
            queue.add(num);
        }

        int i = 0;
        int j = 0; // Selling out sandwich
        while(i != queue.size()){
            int std = queue.poll();

            // If match is found then set interator
            // to zero
            if (sandwiches[j] == std){
                i = 0;
                j++; // if sandwich sold, move to next
                continue;
            }

            // If match is not found then add student
            // back to the queue
            i++;
            queue.add(std);
        }

        // Number of pending students
        return queue.size();
    }
}
