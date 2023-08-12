public class intro {
 public static void main(String[] args) {
  int[] nums = {23, 45, 1, 2, 8, 19, -3, -11, 28};
  int target = 19;
  int ans = linearSearch(nums, target);
  System.out.println(ans);
 } 

  // search in the array
  // return -1 if target not found in array
  static int linearSearch(int[] arr, int target){
    if(arr.length == 0){
      return -1;
    }

    // run a for loop
    for (int index = 0; index < arr.length; index++) {
      // check for element at every index if it is == target
      int element = arr[index];
      if (element == target){
        return index;
      }
    }

    // If target has not been found, then the following result will be printed
    return -1;
  }

  // Second algorithm (alternate idea for linear search)
  static int linearSearch2(int[] arr, int target){
    if(arr.length == 0){
      return Integer.MAX_VALUE;
    }

    // run a for loop
    for (type element : arr) {
      if(element == target)  {
        return element;
      }
    }

    // this line will execute if none of the return statements above have been
    // executed hence, the target has not been found.
    return Integer.MAX_VALUE;
  }

  // Third algorithm (another alternate idea)
  static boolean linearSearch3(int[] arr, int target){
    if(arr.length == 0){
      return false;
    }

    // run a for loop
    for (int element : arr) {
      if (element == target){
        return true;
      }
    }

    // this line will be executed if none of the return statements above have
    // been executed hence, the target has not been found 
    return false;
} }


// Time Complexity
// Best Case : O(1)
// -- If the element is found right in the first element or always at a particular
// -- index. In both cases the time complexity is constant and if it is the
// -- first element, then we would call it best-case scenario. 

// Worst Case : O(n)
// -- You iterate and go through the entire array and then realize that the item
// -- is not present in the array. 
//
// -- If we say that for every comparison we take 0.1ms
// -- Then for "n" elements it would take n * 0.1ms
// The growth of time-complexity is linear (plot graph and check)
