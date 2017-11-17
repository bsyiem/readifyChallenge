package restApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restApp.Logic.ReverseWords;

/**
 * Created by brandon on 17/11/17.
 */

@RestController
public class WordReverseController {

    @RequestMapping(value = "/api/reverseWords", produces = {"application/json", "text/json"})
    public String sendReverseWord(@RequestParam(required = true, name = "sentence") String sentence) {
        return ReverseWords.reverse(sentence);
    }
}
