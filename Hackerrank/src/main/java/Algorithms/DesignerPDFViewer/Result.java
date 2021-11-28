package Algorithms.DesignerPDFViewer;

import java.util.List;

public class Result {
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int height = h.get(word.charAt(i) - 97);
            if (height > max) {
                max = height;
            }
        }
        return max * word.length();
    }
}
