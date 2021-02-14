package LargestDifferenceInIncreasingIndexes;

public class LargestDifference {
    public static int largestDifference(int[] data) {
        int diffMax = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] <= data[j] && j - i > diffMax) {
                    diffMax = j - i;
                }
            }
        }
        return diffMax;
    }
}
