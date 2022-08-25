public static int persistence(long n) {
    
    int result = 1;
    int counter = 0;
    
    while (n > 9) {
      long dig = n % 10;
      result *= dig;
      n = n / 10;
      
      if (n < 10) {
        result *= n;
        n = result;
        result = 1;
        
        counter++;
      }
    } 
    return counter;
}
