package Algorithms.AppleAndOrange;

import java.util.Scanner;

public class Solution {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int appleCounter = 0;
        int orangeCounter = 0;
        for (int i = 0; i < apples.length; i++) {
            int dis = a + apples[i];
            if (dis >= s && dis <= t) {
                appleCounter++;
            }
        }
        for (int j = 0; j < oranges.length; j++) {
            int dis = b + oranges[j];
            if (dis >= s && dis <= t) {
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
