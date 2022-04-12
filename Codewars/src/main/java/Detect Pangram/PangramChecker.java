public class PangramChecker {
  public boolean check(String sentence){
    sentence = sentence.toLowerCase();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String uniqueLetters = "";
    
    for (int i = 0; i < sentence.length(); i++) {
      int indexInAlphabet = alphabet.indexOf(sentence.charAt(i));
      boolean isUnique = uniqueLetters.contains(Character.toString(sentence.charAt(i)));
        if (indexInAlphabet != -1 && !isUnique) {
          uniqueLetters += sentence.charAt(i);
        }
      }
    return uniqueLetters.length() == 26;
  }
}
