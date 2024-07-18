public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) 
    {
        //write your code here
        int[] ar=new int[array.length];
       // ar=array.reverseArray();
         for (int i=array.length-1;i>=0;i--)
         {
            ar[(array.length-1)-i]=array[i] ;
         }
        printArray(ar);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
