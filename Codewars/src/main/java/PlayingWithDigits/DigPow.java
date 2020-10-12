package PlayingWithDigits;

import java.util.ArrayList;
import java.util.List;

public class DigPow {
    public static long digPow(int n, int p) {
        List<Integer> digits = new ArrayList<Integer>();
        int number = n;
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        int sum = 0;
        for (int i = digits.size()-1; i >= 0; i--) {
            sum += Math.pow(digits.get(i), p);
            p++;
        }
        if (sum % n == 0) {
            return sum / n;
        }
        return -1;
    }
}
