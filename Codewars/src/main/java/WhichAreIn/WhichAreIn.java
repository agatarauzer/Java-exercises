package WhichAreIn;

import java.util.ArrayList;
import java.util.Collections;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    result.add(array1[i]);
                    break;
                }
            }
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
    }
}
