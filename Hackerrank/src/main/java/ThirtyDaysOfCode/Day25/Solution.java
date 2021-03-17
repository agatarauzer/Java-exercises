package ThirtyDaysOfCode.Day25;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count > 0) {
            int number = sc.nextInt();
            if (isPrime(number)) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
            count--;
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
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
