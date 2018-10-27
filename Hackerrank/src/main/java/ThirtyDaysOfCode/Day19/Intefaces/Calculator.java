package ThirtyDaysOfCode.Day19.Intefaces;

public class Calculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        int sum = n;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
