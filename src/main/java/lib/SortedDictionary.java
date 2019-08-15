package lib;

import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedDictionary {
    private NavigableSet<SortedWords> dictionary;

    public SortedDictionary() {
        dictionary = new TreeSet<>();
    }


    /**
     * Method @return formatted string with elements which have lenght more than 1
     */
    public String formattedOut() {
        StringBuilder stringBuilder = new StringBuilder();
        dictionary.forEach(obj -> {
            if (obj.getLength() <= 1) {
                return;
            }
            if (obj.equals(dictionary.first())) {
                stringBuilder.append(obj);
                return;
            }
            stringBuilder.append("," + obj);
        });
        return "[" + stringBuilder + "]";
    }

/**
 * @param tokens is list of words which must be processed
 * If first letter of the current word in list is new in dictionary this letter will be added in dictionary like new SortedWords with this word
 * Else SortedWords object with this letter will be found in dictionary and added in set of words sorting by WordsComparator
 */
    public void setDictionary(List<String> tokens) {
        tokens.forEach(token -> {
            if (dictionary.contains(new SortedWords(token.charAt(0)))) {
                dictionary.floor(new SortedWords(token.charAt(0))).addWord(token);
                return;
            }
            dictionary.add(new SortedWords(token));
        });
    }

    public SortedSet<SortedWords> getDictionary() {
        return dictionary;
    }

    /**
     * Method @return string like [firstLetter=[words]]
     */

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        dictionary.forEach(obj -> {
            if (obj.equals(dictionary.last())) {
                stringBuilder.append(obj);
                return;
            }
            stringBuilder.append(obj + ",");
        });
        return "[" + stringBuilder + "]";
    }
}
