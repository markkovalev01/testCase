import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        SortedSet<SortedWords> sortedWords = new TreeSet<>();
        sortedWords.add(new SortedWords('б'));
        sortedWords.add(new SortedWords('a'));
        sortedWords.add(new SortedWords('д'));
        sortedWords.add(new SortedWords('г'));
        sortedWords.forEach(let -> System.out.println(let));
    }
}
