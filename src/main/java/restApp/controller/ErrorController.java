//package restApp.controller;
//
//import org.omg.CORBA.Object;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.servlet.NoHandlerFoundException;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.*;
//import restApp.entities.ApiError;
//
///**
// * Created by brandon on 16/11/17.
// */
//@ControllerAdvice
//public class ErrorController {
//
//    @ExceptionHandler(NoHandlerFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ResponseEntity<ApiError> sendError(){
//
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.setCacheControl("no-cache");
//        responseHeaders.setExpires(-1);
//        responseHeaders.setPragma("no-cache");
//
//        ApiError error = new ApiError("error: 404");
//        return new ResponseEntity<ApiError>(error,responseHeaders,HttpStatus.NOT_FOUND);
//    }
//
//}
