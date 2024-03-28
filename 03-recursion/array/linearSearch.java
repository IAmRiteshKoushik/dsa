import java.util.ArrayList;

/**
 * linearSearch
 */
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        // Check for existancd
        System.out.println(search(arr, 4, 0));
        // Search from beginning
        System.out.println(findIndex(arr, 4, 0));
        // Search from end
        System.out.println(findIndexFromLast(arr, 4, arr.length - 1));
        // Find all indexes
        findAllIndex(arr, 4, 0);
        System.out.println(list);

        // Array list approach
        ArrayList<Integer> ans = findAllIndexAL(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

        // Array list but no ArrayList argument approach
        ArrayList<Integer> ans2 = findAndReturnALnoArgs(arr, 4, 0);
        System.out.println(ans2);
    }

    static boolean search(int[] arr, int target, int index){
        // Simple linear search
        if(index == arr.length){
            return false;
        }
        // Recursion condition
        return arr[index] == target || search(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        // Finding first occurance from the beginning
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    static int findIndexFromLast(int[] arr, int target, int index){
        // Finding first index from the ending
        // We would have to check the zeroth index too, do not put zero
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index - 1);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        // Finding all occurances and storing them inside an arraylist
        // The array list is a static member of the entire class
        if(index == arr.length - 1){
            return; // Void return
        }
        if (arr[index] == target){
            list.add(index); // Appending index to list rather than returning
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndexAL(int[] arr, int target, int index, ArrayList<Integer> list){
        // finding all occurances and storing them and returning an arraylist
        if(index  == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndexAL(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAndReturnALnoArgs(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>(); 

        if (index == arr.length){
            return list;
        }

        // this will contain answer only for a particular function call
        if(arr[index] == target){
            list.add(index);
        }

        // And all the answers from successive function calls are concatenated
        // with the current arrayList and send above.
        ArrayList<Integer> ansFromRecursionCall = findAndReturnALnoArgs(arr, target, index + 1);
        list.addAll(ansFromRecursionCall);
        return list;
    }
}
