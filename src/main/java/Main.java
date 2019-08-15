import lib.SortedDictionary;
import lib.StringProcessor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = StringProcessor.processString("сапог сарай арбуз болт бокс биржа абрикос шашлык помидор хлеб масло кокао человек пончик воля разум сила стая сталь стелька стул стол"," ");
        SortedDictionary sortedDictionary = new SortedDictionary();
        sortedDictionary.setDictionary(list);
//        sortedDictionary.getDictionary().forEach(obj -> System.out.println(obj));
//        System.out.println(sortedDictionary);
        System.out.println(sortedDictionary.formattedOut());
    }
}
