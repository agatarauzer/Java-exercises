package SplitStrings;

public class StringSplit {
    public static String[] solution(String s) {
        String[] result = s.split("(?<=\\G.{2})");
        if (s.length() % 2 != 0) {
            result[result.length - 1] += "_";
        }
        return result;
    }
}
