public class DuplicateEncoder {
  static String encode(String word){
 
    word = word.toLowerCase();
    String result = "";
    
    for (int i = 0; i < word.length(); i++) {
      String cuted = word.substring(0, i) + word.substring(i + 1);     
      if (cuted.contains(Character.toString(word.charAt(i)))) {
        result += ")";
      }
      else {
        result += "(";
      }
    }
    
    return result;
  }
}
