import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        // Generating permutations as output
        permutations("", "abc"); 
        // Generating permurations and storing them in array
        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);
        // Generating the count of permutations
        System.out.println(permutationsCount("", "abcd")); // ans = 24
    }

    // (p: processed, u: unprocessed)
    // Prints out all the permutations one by one as a string
    static void permutations(String p, String up){
        // Base condition, printing starts when unprocessed becomes empty
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            // Add them and skip the first character in the unprocessed string 
            permutations(f + ch + s, up.substring(1));
        }
    }

    // Returns all the permutationos in the form on an arrayList 
    static ArrayList<String> permutationsList(String p, String up){
        // This list is local to each call
        ArrayList<String> ans = new ArrayList<>();

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            // Merging the lists returned after each call
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    // Returns the count of permutations
    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1; // Here we are taking the count,
                      // So return 1 for every successful permutation
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
