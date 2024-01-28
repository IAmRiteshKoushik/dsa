

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i: candies){
            if(i > max){
                max = i;
            }
        }
        List<Boolean> list = new ArrayList<Boolean>();        
        for(int i = 0; i < candies.length; i++){
            if(max <= (candies[i] + extraCandies)){
                list.add(true);
                continue;
            }
            list.add(false);
        }
        return list;
    }
}
