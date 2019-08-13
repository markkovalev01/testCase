import java.util.*;

public class SortedLettersSet implements SortedSet {
    List<SortedWords> sortedWords;


    public Comparator comparator() {
        Comparator<SortedWords> comparator = (SortedWords::compareTo);
        return comparator;
//        return null;
    }

    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    public SortedSet headSet(Object toElement) {
        return null;
    }

    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    public Object first() {
        return sortedWords.get(0);
    }

    public Object last() {
        return sortedWords.get(sortedWords.size()-1);
    }

    public int size() {
        return sortedWords.size();
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        SortedWords letters = (SortedWords) o;
        Iterator iterator = sortedWords.iterator();
        while (iterator.hasNext()) {
            SortedWords words = (SortedWords) iterator.next();
            if (words.equals(letters)) {
                return true;
            }
        }
        return false;
    }

    public Iterator iterator() {
        return sortedWords.iterator();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if(!this.contains(o)){

        }
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
