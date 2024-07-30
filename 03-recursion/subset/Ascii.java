import java.util.ArrayList;

/**
 * Ascii
 */
public class Ascii {

    public static void main(String[] args) {
        // char ch = 'a';
        // Printing out the ascii value due to implicit type conversion
        // System.out.println(ch + 0);
        // Typecasting the converted value back into character as they are
        // compatible for interchange
        // System.out.println((char)(ch + 1));

        System.out.println(subseqAscii("", "abc"));
    }

    static ArrayList<String> subseqAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqAscii(p + ch, up.substring(1));
        ArrayList<String> second = subseqAscii(p, up.substring(1));
        ArrayList<String> third = subseqAscii(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
