public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    
    if (walk.length != 10) {
      return false;
    }
    
    int[] sumDir = new int[]{0,0};
    for (int i = 0; i < walk.length; i++) { 
      switch (walk[i]) { 
          case 'n':
            sumDir[1] += 1;
            break;
          case 's': 
            sumDir[1] -= 1;
            break;
          case 'e':
            sumDir[0] += 1;
            break;
          case 'w':
            sumDir[0] -= 1;
            break;
      }
    }
    return sumDir[0] == 0 && sumDir[1] == 0;
  }
}
