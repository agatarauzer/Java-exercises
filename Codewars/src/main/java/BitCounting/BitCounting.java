public class BitCounting {

  public static int countBits(int n){
    
    String bin = Integer.toBinaryString(n);
    
    int sum = 0;
    for (Character ch : bin.toCharArray()) {
      if (ch == '1') {
        sum++;
      }
    }
    return sum;
  }
}
