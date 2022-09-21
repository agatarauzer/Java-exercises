public class Kata {
  public static int findEvenIndex(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int sumFront = 0;
      int sumBack = 0;
      for (int j = 0; j < i; j++) {
        sumFront += arr[j];
      }
      for (int k = arr.length - 1; k > i; k--) {
        sumBack += arr[k];
      }
      if (sumFront == sumBack) return i;
    }
    return -1;
  }
}
