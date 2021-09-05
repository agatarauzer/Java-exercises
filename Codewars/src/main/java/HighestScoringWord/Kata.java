package HighestScoringWord;

public class Kata {
    public static String high(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;
        String wordMax = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            int sum = 0;
            for (int j = 0; j < words[i].length(); j++) {
                sum += alphabet.indexOf(words[i].charAt(j)) + 1;
            }
            if (sum > max) {
                max = sum;
                wordMax = words[i];
            }
        }
        return wordMax;
    }
}
