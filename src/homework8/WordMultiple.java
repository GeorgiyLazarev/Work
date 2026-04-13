package homework8;

import java.util.*;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();

        Map<String, Integer> countMap = new HashMap<>();

        for (String word : strings) {
            if (countMap.containsKey(word)) {
                int currentCount = countMap.get(word);
                countMap.put(word, currentCount + 1);
            } else {
                countMap.put(word, 1);
            }
        }

        for (String word : countMap.keySet()) {
            if (countMap.get(word) >= 2) {
                result.put(word, true);
            } else {
                result.put(word, false);
            }
        }
        return result;
    }
}
