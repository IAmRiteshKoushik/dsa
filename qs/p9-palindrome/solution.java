/**
 * solution
 */
public class solution {

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }

  public static boolean isPalindrome(int x){
    String num = Integer.toString(x), rev = "";
    for(int i = 0; i < num.length(); i++){
      rev = rev + num.charAt(i);
    }
    System.out.println(rev + " " + num);
    if (!(rev == num)){
      return true;
    }
    return false;
  }
}
