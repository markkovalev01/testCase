import java.util.List;

public class SortedWords implements Comparable {
    private char letter;
    private List<String> words;


    public char getLetter() {
        return letter;
    }

    public List<String> getWords() {
        return words;
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
}
