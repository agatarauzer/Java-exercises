package SimplePigLatin;

public class PigLatin {
    public static String pigIt(String str) {

        String[] splited = str.split("\\s+");
        String[] resultList = new String[splited.length];

        for (int i = 0; i < splited.length; i++) {
            if (splited[i].matches("^[a-zA-Z0-9]*$")) {
                resultList[i] = splited[i].substring(1) + splited[i].charAt(0) + "ay";
            }
            else {
                resultList[i] = splited[i];
            }
        }
        return String.join(" ",resultList );
    }
}
