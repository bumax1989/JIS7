package homework.lectures.lecture7_collections.unique_word_vocabulary;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UniqueWordVocabularyDemo {
    private static final Logger logger = Logger.getLogger(UniqueWordVocabularyDemo.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("word");
        uniqueWordVocabulary.addWord("word");
        uniqueWordVocabulary.addWord("word1");
        uniqueWordVocabulary.addWord("word4");
        uniqueWordVocabulary.addWord("word2");
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.addWord("word5");

        logger.info(uniqueWordVocabulary.getWordsCount());

        uniqueWordVocabulary.printVocabulary();

    }
}
