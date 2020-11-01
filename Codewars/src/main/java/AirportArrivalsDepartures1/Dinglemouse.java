package AirportArrivalsDepartures1;

public class Dinglemouse {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {

        String[] result = new String[lines.length];

        for (int i = 0; i < lines.length; i++) {
            int rotorSum = 0;
            String word = "";

            for (int j = 0; j < lines[i].length(); j++) {
                char ch = lines[i].charAt(j);
                int indexInAlphabet = 0;
                for (int k = 0; k < ALPHABET.length(); k++) {
                    if (ch == ALPHABET.charAt(k)){
                        indexInAlphabet = k;
                    }
                }
                rotorSum += rotors[i][j];
                int rotorFinal = 0;
                if (rotorSum > ALPHABET.length() - indexInAlphabet) {
                    int fromCharIndexToEnd = ALPHABET.length() - indexInAlphabet;
                    int howManyLast = rotorSum - fromCharIndexToEnd;
                    int div = howManyLast /ALPHABET.length();
                    rotorFinal = howManyLast - (ALPHABET.length() * div);
                }
                else {
                    rotorFinal = indexInAlphabet + rotorSum;
                    if (rotorFinal == 54) {
                        rotorFinal = 0;
                    }
                }
                ch = ALPHABET.charAt(rotorFinal);
                word += ch;
            }
            result[i] = word;
        }
        return result;
    }
}
