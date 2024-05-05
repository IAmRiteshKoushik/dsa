class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
    }
    public static int minCostToEqualizeArray(int[] nums, int cost1, int cost2){
        int cost;
        return cost;
    }
    public static int minimumOperationsToMakeKPeriodic(String word, int k){
        int ops = 0;

        return ops;
    }
    public static boolean isValid(String word) {
        // Size check
        if(word.length() < 3){
            return false;
        } 
        // Conditions check
        boolean vowel = false;
        boolean consonant = false;
        
        for(char e: word.toCharArray()){
            e = Character.toLowerCase(e);
            // Vowel check
            if(e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u'){
                vowel = true;
                continue;
            }
            // Consonant check - other than vowel and consonant, there are 3 symbols and numbers(0-9)
            if(e == '@' || e == '#' || e == '$'){
                return false;
            }
            if(!(Character.isDigit(e))){
                consonant = true;
                continue;
            }
        }
        
        return vowel && consonant;
    }
}
