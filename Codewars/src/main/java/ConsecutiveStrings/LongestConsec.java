import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
      
      if (strarr.length == 0 || k > strarr.length || k <= 0) {
        return "";
      }
      
      String longest = "";
      for (int i = 0; i < strarr.length - k + 1; i++) {
        String newWord = "";
        for (int j = i; j < i + k; j++) {
          newWord += strarr[j];
        }
        if (newWord.length() > longest.length()) {
          longest = newWord;
        }
      }
      return longest;
    }
}
