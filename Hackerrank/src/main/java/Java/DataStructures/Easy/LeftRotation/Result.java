package Java.DataStructures.Easy.LeftRotation;

import java.util.List;

public class Result {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> resultList = arr.subList(d, arr.size());
        resultList.addAll(arr.subList(0, d));
        return resultList;
    }
}
