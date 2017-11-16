package restApp.controller;

/*
 * Created by brandon on 16/11/17.
 * Controller for sending valid token
 */
import org.springframework.web.bind.annotation.*;

@RestController
public class TokenController {

    @RequestMapping("/api/token")
    public String sendToken(){
        return "fe2c780f-4bc3-4759-b5ed-0f363d64b11d";
    }
}