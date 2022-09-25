public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {
    String[] result = new String[nFloors];
    for (int i = 0; i < nFloors; i++) {
      String floor = "";
      for (int j =  nFloors - 1 - i; j > 0 ; j--) {
        floor += " ";
      }
      for (int k = 0; k < i * 2 + 1; k++) {
        floor += "*";
      }
      for (int m =  nFloors - 1 - i; m > 0 ; m--) {
        floor += " ";
      }
      result[i] = floor;
      } 
    return result;
   }
}
