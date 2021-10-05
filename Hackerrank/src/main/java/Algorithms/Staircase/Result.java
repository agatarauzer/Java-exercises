package Algorithms.Staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++ ) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
