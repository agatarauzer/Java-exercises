package ThirtyDaysOfCode.Day20;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
            totalSwaps += numberOfSwaps;
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.\nFirst Element: " +
                a[0] + "\nLast Element: " + a[a.length - 1]);
    }
}
