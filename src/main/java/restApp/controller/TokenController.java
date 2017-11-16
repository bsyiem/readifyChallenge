package restApp.controller;

/*
 * Created by brandon on 16/11/17.
 * Controller for sending valid token
 */
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class TokenController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/token", produces = {"application/json"})
    public ResponseEntity<String> sendToken(){
        return ResponseEntity.ok("fe2c780f-4bc3-4759-b5ed-0f363d64b11d");
    }
}