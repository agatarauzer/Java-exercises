package Algorithms.SubarrayDivision;

import java.util.List;

public class Result {
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int counter = 0;
        for (int i = 0; i < s.size(); i++) {
            int sum = s.get(i);
            int numOfElements = 1;
            for (int j = i + 1; j < s.size(); j++) {
                numOfElements++;
                sum += s.get(j);
                if (numOfElements == m) {
                    break;
                }
            }
            if (sum == d) {
                counter++;
            }
        }
        return counter;
    }
}
