import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PickPeaks {
    
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        
      Map<String, List<Integer>> result = new HashMap<>() {{
            put("pos",   new ArrayList<Integer>() );
            put("peaks", new ArrayList<Integer>() );
        }};
           
      int startPos = 0;
      for (int i = 1; i < arr.length - 1; i++) {
        if (arr[i] > arr[i-1]) {
            startPos = i;
        }
        if (arr[i] > arr[i+1] && startPos != 0) {
            result.get("pos").add(startPos);
            result.get("peaks").add(arr[startPos]);
            startPos = 0;
        }  
      } 
      return result;
    }
}
