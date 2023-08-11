import java.util.ArrayList;

public class MultipleAL {
  public static void main(String[] args) {
    // Multi-Dimensional Array Lists
    ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 

    // initialization
    for (int i = 0; i < 3; i++) {
      list.add(new ArrayList<>());
    }
    // If you need to add more elements, then you would have to add in more
    // array lists. 

    // Add Elements
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list.get(i).add(in.nextInt());
      }
    }

    System.out.println(list);
    
  }
}
