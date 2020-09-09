package ExesAndOhs;

public class XO {

    public static boolean getXO (String str) {

        int xCounter = 0;
        int oCounter = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 120 ) {
                xCounter++;
            }
            if (str.charAt(i) == 111) {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }
}
