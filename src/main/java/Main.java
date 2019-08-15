import lib.SortedDictionary;
import lib.StringProcessor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = StringProcessor.processString("сапог сарай арбуз болт бокс биржа абрикос"," ");
//        System.out.println(list.getClass().getName());
//        list.forEach(obj -> System.out.println(obj));
        SortedDictionary sortedDictionary = new SortedDictionary();
        sortedDictionary.setDictionary(list);
        sortedDictionary.getDictionary().forEach(obj -> System.out.println(obj));
    }
}
