package SumsOfParts;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] parts_sums = new int[ls.length + 1];
        parts_sums[ls.length] = 0;
        int sum = 0;

        for (int i = ls.length - 1; i >= 0; i--) {
            sum += ls[i];
            parts_sums[i] = sum;
        }

        return parts_sums;
    }
}
