package restApp.controller;

/*
 * Created by brandon on 16/11/17.
 * Controller for sending valid token
 */

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class TokenController {

    private String token = "\"fe2c780f-4bc3-4759-b5ed-0f363d64b11d\"";

    @RequestMapping(method = RequestMethod.GET, value = "/api/{([tT][oO][kK][eE][nN]) }", produces = {"application/json", "text/json"})
    public ResponseEntity<String> sendToken(){

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setCacheControl("no-cache");
        responseHeaders.setExpires(-1);
        responseHeaders.setPragma("no-cache");

        return new ResponseEntity<String>(token,responseHeaders, HttpStatus.OK);
    }
}