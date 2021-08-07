package CountingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> charactersCounter = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.toLowerCase().charAt(i);
            if (charactersCounter.containsKey(character)) {
                int currentCount = charactersCounter.get(character) + 1;
                charactersCounter.put(character, currentCount);
                if (currentCount == 2) {
                    counter++;
                }
            }
            else {
                charactersCounter.put(character, 1);
            }
        }
        return counter;
    }
}
