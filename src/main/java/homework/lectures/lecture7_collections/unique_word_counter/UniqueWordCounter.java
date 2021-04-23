package homework.lectures.lecture7_collections.unique_word_counter;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    private static final Logger logger = Logger.getLogger(UniqueWordCounter.class);
    private Map<String, Integer> map = new HashMap<>();

    public void addWord(String word) {
        if (map.containsKey(word)) {
            map.put(word, map.get(word) + 1);
        } else {
            map.put(word, 1);
        }
    }

    public String getMostFrequentWord() {
        int maxElement = 0;
        String result = null;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > maxElement) {
                maxElement = pair.getValue();
                result = pair.getKey();
            }
        }
        return result;
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            logger.info("The word '" + pair.getKey() + "' meets for " + pair.getValue() + " time(s)");
        }
    }
}
