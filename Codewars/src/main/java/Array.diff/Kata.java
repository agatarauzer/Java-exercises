import java.util.List;
import java.util.ArrayList;


public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    
    ArrayList<Integer> result = new ArrayList<>();
    
    for (int i = 0; i < a.length; i++) {
      boolean isPresent = false;
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          isPresent = true;
        }
      }
      if (!isPresent) {
        result.add(a[i]);
      }
    }
   
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
