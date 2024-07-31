import java.util.ArrayList;

/**
 * Dice
 */
public class Dice {

    public static void main(String[] args) {
        dice("", 4);
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        // This is for 1 dice
        for(int i = 1; i <= 6 && i <= target; i++){
            // p + i works but is not elegant
            dice(p + Integer.toString(i), target - i);
        }
    }

    static ArrayList<String> diceArr(String p, int target){
        if(target == 0){
            ArrayList<String> res = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0);
        ArrayList<String> list = new ArrayListM<>();

        // This is for 1 dice
        for(int i = 1; i <= 6 && i <= target; i++){
            // p + i works but is not elegant
            list.addAll(diceRet(p + Integer.toString(i), target - i));
        }
        return list;
    }
}
