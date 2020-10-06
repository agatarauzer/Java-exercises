package FindTheUniqueNumber;

public class Kata {
    public static double findUniq(double arr[]) {

        if (arr[0] != arr[1] && arr[1] == arr[2]) {
            return arr[0];
        }
        for(int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                return arr[i];
            }
        }
        return arr[0];
    }
}
