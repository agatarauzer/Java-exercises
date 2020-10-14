package TransformToPrime;

import java.util.Arrays;

public class Solution {

    public static int minimumNumber(int[] numbers)
    {
        int sum = Arrays.stream(numbers).sum();
        int searched = sum;
        while (!isPrime(searched)) {
            searched += 1;
        }
        return searched - sum;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
