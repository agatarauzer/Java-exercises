import java.util.Arrays;
import java.util.OptionalInt;


public class Kata {
    public static int findShort(String s) {
      OptionalInt  max = Arrays.stream(s.split(" "))
        .mapToInt(String::length)
        .min();
      return max.orElse(0);  
    }
}
