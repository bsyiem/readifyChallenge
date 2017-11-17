package restApp.Logic;

import java.util.StringJoiner;

/**
 * Created by brandon on 18/11/17.
 */
public class ReverseWords {

    public static String reverse(String sentence){
        String[] words = sentence.split(" ");
        StringJoiner sj = new StringJoiner(" ");

        for(int i = 0; i<words.length;i++){
            String reverseWord = new StringBuffer(words[i]).reverse().toString();
            sj.add(reverseWord);
        }

        StringBuilder sb = new StringBuilder(sj.toString());

        sb.insert(0,"\"");
        sb.append("\"");
        
        return sb.toString();
    }
}
