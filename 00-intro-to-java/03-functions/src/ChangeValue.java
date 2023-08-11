import java.util.Arrays;

public class ChangeValue {

  public static void main(String[] args) {
    // create an array 
    int[] arr = {1, 2, 3, 45, 6};
    change(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void change(int[] nums) {
    nums[0] = 99; // A change to the object via this, changes the actual array
    // We do not pass a copy of the array but the address of the array is passed
    // If this was a string, it would be passed as a copy but arrays be 
    // default as passed this way There is no way to pass pointers to strings in Java
    // NOTE : We do not have the concept of pointers in Java
  }
}
