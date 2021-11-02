package Algorithms.BreakingTheRecords;

import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);
        int minCounter = 0;
        int maxCounter = 0;
        for (int i = 1; i < scores.size(); i++) {
            int currScore = scores.get(i);
            if (currScore > highestScore) {
                maxCounter++;
                highestScore = currScore;
            }
            if (currScore < lowestScore) {
                minCounter++;
                lowestScore = currScore;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxCounter);
        result.add(minCounter);
        return result;
    }
}
