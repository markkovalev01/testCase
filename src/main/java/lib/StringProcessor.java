package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * This class using for create list of words from string with delimeters
 */
public class StringProcessor {

    private static StringTokenizer stringTokenizer;

    /**
     *
     * @param string with default delimeter(" ")
     * @return List of words
     */
    public static List<String> processString(String string){
        stringTokenizer = new StringTokenizer(string, " ");
        List<String> tokens = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }

    /**
     *
     * @param string string with user delimeters
     * @param delim is user's delimeters
     * @return List of words
     */
    public static List<String> processString(String string, String delim){
        stringTokenizer = new StringTokenizer(string, delim);
        List<String> tokens = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }

}
