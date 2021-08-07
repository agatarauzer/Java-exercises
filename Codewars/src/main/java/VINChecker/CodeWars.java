package VINChecker;

public class CodeWars {
    public static boolean checkVin(String vin) {
        if (vin.length() != 17) {
            return false;
        }
        if (vin.contains("I") || vin.contains("O") || vin.contains("Q")) {
            return false;
        }
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String codeNumbers = "12345678012345070923456789";
        int[] weights = new int[]{8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
        int sum = 0;
        for (int i = 0; i < vin.length(); i++) {
            int indexInAlphabet = alphabet.indexOf(vin.charAt(i));
            int decoded = vin.charAt(i) - 48;
            if (indexInAlphabet != -1) {
                decoded = codeNumbers.charAt(indexInAlphabet) - 48;
            }
            sum += decoded * weights[i];
        }
        String modulo = String.valueOf(sum % 11);
        if (modulo.equals("10")) {
            modulo = "X";
        }
        String charAt9 = Character.toString(vin.charAt(8));
        return modulo.equals(charAt9);
    }
}
