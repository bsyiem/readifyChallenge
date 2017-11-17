package restApp.Logic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brandon on 18/11/17.
 */
public class ReverseWordsTest {
    @Test
    public void reverse() throws Exception {

        String word = "abc 123";
        String reverse = "cba 321";

        assertEquals(ReverseWords.reverse(word),reverse);
    }

}