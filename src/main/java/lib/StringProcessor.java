package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringProcessor {

    private static StringTokenizer stringTokenizer;


    public static List<String> processString(String string, String delim){
        stringTokenizer = new StringTokenizer(string, delim);
        List<String> tokens = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }

}
