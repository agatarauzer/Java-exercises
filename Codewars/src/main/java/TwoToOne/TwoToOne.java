import java.util.Comparator;
import java.util.stream.Collectors;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
      String s = s1 + s2;
      return s.chars()
        .mapToObj(e -> Character.toString((char) e))
        .distinct()
        .sorted()
        .collect(Collectors.joining ("")); 
    }
}
