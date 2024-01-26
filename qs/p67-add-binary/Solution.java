public class Solution {
    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder(); // Mutable string = StringBuilder
        
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0 || carry == 1){
            if (i >= 0) {
                carry += a.charAt(i--) - '0'; // integer conversion technique
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0'; // integer conversion technique
            }

            // Inserting and bringing down the carry
            sb.insert(0, carry % 2);
            carry = carry / 2;
        }
        return sb.toString(); // Converting to String and returning
    }

    public static String addBinarySHORT(String a, String b){
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2); // Convert to integer with radix = 2
        String result = Integer.toString(sum, 2); // Convert to string with radix = 2
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinarySHORT("111", "11"));
        System.out.println(Integer.parseInt("111", 2));
        // System.out.println('0' - '1'); // Their ASCII integer values are taken and subtracted
    }
}
