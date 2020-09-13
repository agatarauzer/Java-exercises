package CreditCardMask;

public class Maskify {
    public static String maskify(String str) {

        int len = str.length();
        if (len <= 4) {
            return str;
        }
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len - 4; i++) {
                sb.append("#");
            }
            return sb.toString() + str.substring(len - 4);
        }
    }
}
