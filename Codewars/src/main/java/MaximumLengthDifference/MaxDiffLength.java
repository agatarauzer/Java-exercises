import java.lang.Math;

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
      
      if (a1.length == 0 || a2.length == 0) {
        return -1;
      }
      
      int max = 0;
      for (int i = 0; i < a1.length; i++) {
        int lengthA1 = a1[i].length();
        for (int j = 0; j < a2.length; j++) {
          int lengthA2 = a2[j].length();
          int diff = Math.abs(lengthA1 - lengthA2);
          if (diff > max) {
            max = diff;
          }
        }
      }
      return max;
    }
}
