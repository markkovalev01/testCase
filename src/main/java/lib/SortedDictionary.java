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
