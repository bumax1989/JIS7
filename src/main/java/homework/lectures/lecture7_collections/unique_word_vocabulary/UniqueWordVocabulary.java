package homework.lectures.lecture7_collections.unique_word_vocabulary;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    private static final Logger logger = Logger.getLogger(UniqueWordVocabulary.class);

    private Set<String> vocabularySet = new HashSet<>();

    public void addWord(String word) {

        if (word != null && !word.isEmpty()) {
            vocabularySet.add(word);
        } else
            logger.info("Incorrect input!");
    }

    public int getWordsCount() {
        int count = 0;

        for (String word : vocabularySet) {
            count++;
        }
        return count;
    }

    public void printVocabulary() {
        for (String word : vocabularySet) {
            logger.info(word);
        }
    }
}
