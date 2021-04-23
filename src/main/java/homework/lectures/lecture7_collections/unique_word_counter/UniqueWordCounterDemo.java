package homework.lectures.lecture7_collections.unique_word_counter;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UniqueWordCounterDemo {
    private static final Logger logger = Logger.getLogger(UniqueWordCounterDemo.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

        uniqueWordCounter.addWord("word");
        uniqueWordCounter.addWord("word1");
        uniqueWordCounter.addWord("word");
        uniqueWordCounter.addWord("word");
        uniqueWordCounter.addWord("word4");
        uniqueWordCounter.addWord("word5");
        uniqueWordCounter.addWord("word5");
        uniqueWordCounter.addWord("word5");
        uniqueWordCounter.addWord("word5");

        logger.info("The Most Frequent Word is: " + uniqueWordCounter.getMostFrequentWord());

        uniqueWordCounter.printWordsFrequency();
    }
}
