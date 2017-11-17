package restApp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restApp.Logic.Fibonacci;

/**
 * Created by brandon on 17/11/17.
 */

@RestController
public class FibonacciController {

    @RequestMapping(value = "/api/fibonacci", produces = {"application/json", "text/json"})
    public String sendFibonacciNumber(@RequestParam(required = true, name = "n") int n){
        try{
            return String.valueOf(Fibonacci.getFibonacciNumberAt(n));
        }catch(Exception e){
            return null;
        }

    }

}
