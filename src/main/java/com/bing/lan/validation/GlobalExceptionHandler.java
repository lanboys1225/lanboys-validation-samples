//package com.bing.lan.validation;
//
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import javax.validation.ConstraintViolationException;
//
///**
// * Created by lb on 2020/5/11.
// */
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ResponseBody
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public String validation(MethodArgumentNotValidException e) {
//        System.out.println("validation()>>>>>>>>>>>>>: " + e);
//        return "参数异常";
//    }
//
//    @ResponseBody
//    @ExceptionHandler(ConstraintViolationException.class)
//    public String validation(ConstraintViolationException e) {
//        System.out.println("validation()>>>>>>>>>>>>>: " + e);
//        return "参数异常";
//    }
//}
