public class Solution {
  public static int zeros(int n) {
    int result = 0;
    for (int i = 5; i < n ; i *= 5) {
      result += n / i;   
    }
      return result;
  }
}
