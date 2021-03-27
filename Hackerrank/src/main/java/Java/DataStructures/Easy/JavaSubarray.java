package Java.DataStructures.Easy;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        int counter = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            int k = i;
            int sum = 0;
            while (k >= 0) {
                sum += arr[k];
                if (sum < 0) {
                    counter++;
                }
                k--;
            }
        }
        System.out.println(counter);
    }
}
