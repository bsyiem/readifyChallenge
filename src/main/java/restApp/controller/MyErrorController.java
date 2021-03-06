package restApp.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restApp.entities.ApiError;

/**
 * Created by brandon on 16/11/17.
 */
@RestController
public class MyErrorController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ResponseEntity<ApiError> sendError(){

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setCacheControl("no-cache");
        responseHeaders.setExpires(-1);
        responseHeaders.setPragma("no-cache");

        ApiError error = new ApiError("error: 404");
        return new ResponseEntity<ApiError>(error,responseHeaders,HttpStatus.NOT_FOUND);
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
