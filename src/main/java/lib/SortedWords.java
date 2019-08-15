package lib;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedWords implements Comparable {
    private char letter;
    private SortedSet<String> words;

    public SortedWords(char letter) {
        this.letter = letter;
        words = new TreeSet<>(new WordsComparator());
    }

    public SortedWords(String token) {
        letter = token.charAt(0);
        words = new TreeSet<>(new WordsComparator());
        words.add(token);
    }

    public boolean addWord(String word) {
            return words.add(word);
    }


    public char getLetter() {
        return letter;
    }

    public SortedSet<String> getWords() {
        return words;
    }

    public int getLength(){
        return words.size();
    }


    @Override
    public boolean equals(Object obj) {
        SortedWords sortedWords = (SortedWords) obj;
        return sortedWords.getLetter() == letter;
    }

    public int compareTo(Object o) {
        SortedWords sortedWords = (SortedWords) o;
        Integer let = (int) letter;
        Integer letComp = (int) sortedWords.getLetter();
        return let.compareTo(letComp);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        words.forEach(obj -> {
            if (obj.equals(words.last())) {
                stringBuilder.append(obj);
                return;
            }
            stringBuilder.append(obj + ",");
        });
        return letter + "=["+stringBuilder+"]";
    }
}
