package Scramblies;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            int index= str1.indexOf(str2.charAt(i));
            if (index == -1) {
                return false;
            }
            else {
                str1 = str1.substring(0,index) + "-" + str1.substring(index+1);
            }
        }
        return true;
    }
}
