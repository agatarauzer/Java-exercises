package ConvertHexStringToRGB;

public class HexToRGB {
    public static int[] hexStringToRGB(String hex) {
        String hexBase = "0123456789ABCDEF";
        int[] resultRGB = new int[3];
        for (int i = 1, j=0; i < 6; i=i+2, j++) {
            char ch1 = hex.toUpperCase().charAt(i);
            char ch2 = hex.toUpperCase().charAt(i+1);
            int sum = hexBase.indexOf(ch1) * 16 + hexBase.indexOf(ch2);
            resultRGB[j] = sum;
        }
        return resultRGB;
    }
}
