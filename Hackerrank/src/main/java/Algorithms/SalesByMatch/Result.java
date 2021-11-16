package Algorithms.SalesByMatch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> colors = new HashSet<>();
        int pairsCounter = 0;
        for (Integer color : ar) {
            if (colors.contains(color)) {
                pairsCounter++;
                colors.remove(color);
            }
            else {
                colors.add(color);
            }
        }
        return pairsCounter;
    }
}
