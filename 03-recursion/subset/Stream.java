/**
 * Introduction to string manipulation through recursion
 */
public class Stream {

    public static void main(String[] args) {
        String str = conditionalSkip("baasswdfadappeadafsd", "apple", "app");
        System.out.println(str);
    }

    // p -> processed, up -> unprocessed
    static void skip(String p, String up){
        if(up.isEmpty()){
            // Printing out the entire string 
            System.out.println(p);
            return;
        }

        // Locating the first character
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipReturn(String up){
        if(up.isEmpty()){
            // Printing out the entire string 
            return "";
        }

        // Locating the first character
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipReturn(up.substring(1));
        } else {
            return ch + skipReturn(up.substring(1));
        }
    }

    static String skipSubstring(String up, String sub){
        if(up.isEmpty()){
            return "";
        }

        // We are not checking character wise
        if(up.startsWith(sub)){
            return skipSubstring(up.substring(sub.length()), sub);
        } else {
            return up.charAt(0) + skipSubstring(up.substring(1), sub);
        }
    }

    static String conditionalSkip(String up, String sub, String skipStr){
        if(up.isEmpty()){
            return "";
        }
        // We are not checking character wise
        if(!up.startsWith(sub) && up.startsWith(skipStr)){
            return conditionalSkip(up.substring(skipStr.length()), sub, skipStr);
        } else {
            return up.charAt(0) + conditionalSkip(up.substring(1), sub, skipStr);
        }
    }
}
