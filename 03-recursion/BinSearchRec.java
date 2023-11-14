/**
 * BinSearchRec
 */
public class BinSearchRec {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 55, 66, 78};
    int target = 67;
    System.out.println(search(arr, target, 0, arr.length - 1));
  }

  static int search(int[] arr, int target, int s, int e){

    if (s > e){
      return -1;
    }

    // Finding middle element (efficiently)
    int m = s + (e - s) / 2;

    if (arr[m] == taget){
      return m;
    }
    if (target < arr[m]){
      return search(arr, target, s, m - 1);
    }
    return search(arr, target, m + 1, e);
  }
}
