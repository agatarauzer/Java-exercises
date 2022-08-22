public class DRoot {
  public static int digital_root(int n) {

    int sum = 0;
    do {
      sum = 0;
      while (n > 0) {
        sum += n % 10;
        n = n / 10; 
      }
      n = sum;
    } while (sum > 9);
          
    return sum;
    
    // solution using recursion
    /*
    if (n < 10) {
      return n;
    }
      
    int sum = 0; 
    while (n >= 1) {
      sum += n % 10;
      n = n / 10;
    }
    return digital_root(sum);
    
    */
    
  }
}

