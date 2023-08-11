import java.util.Arrays;

public class reverseArr {
  public static void main(String[] args) {
    int[] arr = {1, 3, 23, 9, 18};
    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }

  // This is called as two pointer method
  static void reverse(int[] arr){
    int start = 0;
    int end = arr.length - 1;

    while(start < end){
      // swap start and end
      // increment start
      // decrement end
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  static void swap(int[] arr, int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
