public class PlayPass {
  public static String playPass(String s, int n) {
    s = s.toLowerCase();
    StringBuilder result = new StringBuilder("");
 
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      char changed = ch;
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      
      if (Character.isLetter(ch)) {
        int indexInAlphabet = alphabet.indexOf(ch);
        int indexOfShifted = indexInAlphabet + n;  
        if (indexOfShifted > 25) {
          indexOfShifted -= 26;
        }
        changed = alphabet.charAt(indexOfShifted);
      }
      
      if (Character.isDigit(ch)) {
        int charInt = 57 - ch;
        changed = (char) (charInt + '0');
      }
  
      if (i % 2 == 0) {
        changed = Character.toUpperCase(changed);
      }
      
      result.append(changed);
    }
    
    return result.reverse().toString();
  }
}
