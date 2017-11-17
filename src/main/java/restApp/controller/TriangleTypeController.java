package restApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restApp.Logic.TriangleCheck;

/**
 * Created by brandon on 17/11/17.
 */

@RestController
public class TriangleTypeController {
    @RequestMapping(value = "/api/triangleType", produces = {"application/json","text/json"})
    public String sendTriangleType(@RequestParam(name = "a",required = true) int a, @RequestParam(name = "a",required = true) int b, @RequestParam(name = "a",required = true) int c){
        return TriangleCheck.checkTriangle(a,b,c);
    }
}
