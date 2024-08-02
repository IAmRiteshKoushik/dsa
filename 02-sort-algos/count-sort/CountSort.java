import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CountSort {
    // Does not work for decimal or negative numbers
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 3, 2, 5, 2, 8};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSortHash(int[] array){
        if(array == null || array.length <= 1){

            return;
        }

        // Find max and min
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        // Populating the hashMap
        for(int num: array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for(int i = min; i <= max; i++){
            int count = countMap.getOrDefault(i, 0);
            for(int j = 0; j < count; j++){
                array[index] = i;
                index++;
            }
        }
    }

    public static void countSort(int[] array){
        if(array == null || array.length <= 1){

            return;
        }

        // Find max
        int max = array[0];
        for(int num: array){
            if (num > max) {
                max = num;
            }
        }

        // Populate frequency distro table
        int [] countArray = new int[max + 1];
        for(int num: array){
            countArray[num]++;
        }

        int index = 0;
        for(int i = 1; i < countArray.length; i++){
            while(countArray[i] > 0){
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }

}
