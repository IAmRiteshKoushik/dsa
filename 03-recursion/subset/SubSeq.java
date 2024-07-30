import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> res = subseqArr("", "abc");
        // You cannot print out lists but you can print out arraylists 
        // in Java directly (without any Arrays.toString()) conversion
        System.out.println(res);
    }

    // Direct printing
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    
    // Appending to array-list
    static ArrayList<String> subseqArr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            // Lists get created only at the bottom most level and the 
            // processed string is added into the list and returned. This
            // is done for both left and right subtree which in turn are 
            // merged into a single list and passed to non-leaf nodes
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        // Taking a character from the unprocessed string
        ArrayList<String> left = subseqArr(p + ch, up.substring(1));
        // Rejecting a character from the unprocessed string
        ArrayList<String> right = subseqArr(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
