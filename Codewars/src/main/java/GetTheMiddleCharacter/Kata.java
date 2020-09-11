package GetTheMiddleCharacter;

public class Kata {
    public static String getMiddle(String word) {
        int stringLen = word.length();

        if (stringLen == 1) {
            return word;
        }
        if (stringLen % 2 == 0 ) {
            return word.substring(stringLen/2 - 1, stringLen/2 + 1);
        }
        else {
            return word.substring(stringLen/2, stringLen/2 + 1);
        }
    }
}
