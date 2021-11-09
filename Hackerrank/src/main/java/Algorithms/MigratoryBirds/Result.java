package Algorithms.MigratoryBirds;

import java.util.List;

public class Result {
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] counts = new int[arr.size()];
        for (Integer id : arr) {
            counts[id]++;
        }
        int maxIndex = 1;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
