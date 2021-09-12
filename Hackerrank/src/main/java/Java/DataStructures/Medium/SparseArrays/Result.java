package Java.DataStructures.Medium.SparseArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> uniqueQueriesCount = new HashMap<>();
        for (String query : queries) {
            if (uniqueQueriesCount.containsKey(query)) {
                int counter = uniqueQueriesCount.get(query);
                result.add(counter);
            }
            else {
                int counter = 0;
                int index = strings.indexOf(query);
                while (index != -1) {
                    counter++;
                    strings.remove(index);
                    index = strings.indexOf(query);
                }
                uniqueQueriesCount.put(query, counter);
                result.add(counter);
            }
        }
        return result;
    }
}
