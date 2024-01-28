class Solution {

    // Performance optimal solution
    public String interpretBetter(String command){
        StringBuilder sb = new StrinbBuilder();
        char[] ch = command.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'G'){
                sb.append('G');
            } else if(ch[i] == '(' && ch[i+1] == ')'){
                sb.append('o');
                ++i;
            }else{
                sb.append("al");
                i += 3;
            }
        }
        return sb;
    }

    // We can avoid the nesting by the following
    public String interpret(String command) {
       String res = "";
       for(int i = 0; i < command.length(); i++){
           if(command.charAt(i) == 'G'){
               res += command.charAt(i);
           } else if(command.charAt(i) == '('){
               if(command.charAt(i + 1) == ')'){
                   res += 'o';
                   i = i + 1;
               }else{
                   res += "al";
                   i = i + 3;
               }
           }
       }
       return res;
    }
}
