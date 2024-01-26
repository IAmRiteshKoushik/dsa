import java.util.Stack;

class Solution {
    public boolean isValid(String s){
        Stack <Character> stack = new Stack<Character>(); // empty stack
        for (char c : s.toCharArray()) {
           if(c == '('){
               stack.push(')'); // push the closing element
           } else if(c == '{'){
               stack.push('}'); // push the closing element
           } else if(c == '['){
               stack.push(']'); // pusht the closing element
           } else if (stack.isEmpty() || stack.pop() != c){
               return false; // stops iteration and immeditately returns false
           }
        }
        return stack.isEmpty(); // returns true or false
    }

}


