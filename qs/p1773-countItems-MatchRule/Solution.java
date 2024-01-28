class Solution {


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;    
        int check = 0;

        if(ruleKey.equals("type")){
            check = 0;
        } else if(ruleKey.equals("color")){
            check = 1;
        }else {
            check = 2;
        }

        // Lists are internally array lists so their length is found by .size()
        // ArrayList items are extracted using the .get() method
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).get(check));
            if(items.get(i).get(check).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}

// Leetcode Solution - Reduces iff-statement usage (more efficient)
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) result++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) result++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) result++;
        }
        
        return result;
        
    }
}
