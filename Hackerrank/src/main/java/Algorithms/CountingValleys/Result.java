package Algorithms.CountingValleys;

public class Result {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int stepsMonit = 0;
        int valleyCounter = 0;
        boolean isValley = false;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                stepsMonit++;
            }
            else {
                stepsMonit--;
            }

            if (stepsMonit < 0) {
                isValley = true;
            }
            if (isValley && stepsMonit == 0) {
                valleyCounter++;
                isValley = false;
            }
        }
        return valleyCounter;
    }
}
