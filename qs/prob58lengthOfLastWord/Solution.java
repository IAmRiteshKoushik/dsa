public class Solution {
    public static int lengthOfLastWord(String s){
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        int lastIndex = i;

        while(i >= 0 && s.charAt(i) != ' '){
            i--;
        }

        return lastIndex - i;
    }

    public static int lengthOfLastWordCHEATING(String s){
        return s.trim().substring(s.trim().lastIndexOf(" ") + 1, s.trim().length()).length();
    }

    public static void main(String[] args) {
        String s = " moon     ";
        System.out.println("" + lengthOfLastWord(s));
        System.out.println(lengthOfLastWordCHEATING(s));
    }
}
