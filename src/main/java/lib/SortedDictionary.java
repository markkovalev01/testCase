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


    public void setDictionary(List<String> tokens) {
        tokens.forEach(token -> {
            if(dictionary.contains(new SortedWords(token.charAt(0)))){
                dictionary.floor(new SortedWords(token.charAt(0))).addWord(token);
                return;
            }
            System.out.println(token);
            dictionary.add(new SortedWords(token));
        });
    }

    public SortedSet<SortedWords> getDictionary() {
        return dictionary;
    }
}
