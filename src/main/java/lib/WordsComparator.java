package lib;

import java.util.Comparator;


/**
 * This class using for ordering words
 */

public class WordsComparator implements Comparator<String> {

    /**
     * First compare lenght
     * If lenght equals using natural ordering
     */
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return -1;
        }
        if (o1.length() < o2.length()) {
            return 1;
        }
        return o1.compareTo(o2);
    }
}
