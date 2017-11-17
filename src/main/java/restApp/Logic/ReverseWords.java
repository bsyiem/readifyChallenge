package restApp.Logic;

/**
 * Created by brandon on 18/11/17.
 */
public class ReverseWords {

    public static String reverse(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<words.length;i++){
            String reverseWord = new StringBuffer(words[i]).reverse().toString();
            sb.append(reverseWord);
            if(i!= words.length-1){
                sb.append(' ');
            }
        }
        sb.insert(0,"\"");
        sb.append("\"");
        return sb.toString();
    }
}
