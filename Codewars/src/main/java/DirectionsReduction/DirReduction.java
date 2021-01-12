package DirectionsReduction;

import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int listSizeBefore = list.size();
        int listSizeAfter = 0;

        while (listSizeBefore != listSizeAfter) {
            listSizeBefore = list.size();
            for (int i = 0; i < list.size() - 1; i++) {
                if (areRedundant(list.get(i), list.get(i+1))) {
                    list.remove(i+1);
                    list.remove(i);
                }
            }
            listSizeAfter = list.size();
        }
        String[] result = new String[list.size()];
        result = list.toArray(result);
        return result;
    }

    private static boolean areRedundant(String dir1, String dir2) {
        if (dir1.equals("NORTH") && dir2.equals("SOUTH")) {
            return true;
        }
        if (dir1.equals("SOUTH") && dir2.equals("NORTH")) {
            return true;
        }
        if (dir1.equals("EAST") && dir2.equals("WEST")) {
            return true;
        }
        if (dir1.equals("WEST") && dir2.equals("EAST")) {
            return true;
        }
        return false;
    }
}
