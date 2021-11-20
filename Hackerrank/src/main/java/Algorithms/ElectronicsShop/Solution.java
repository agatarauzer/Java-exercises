package Algorithms.ElectronicsShop;

public class Solution {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int sumMax = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int currSum = keyboards[i] + drives[j];
                if (currSum <= b && currSum > sumMax) {
                    sumMax = currSum;
                }
            }
        }
        return sumMax;
    }
}
