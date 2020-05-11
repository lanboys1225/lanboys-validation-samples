//package com.bing.lan.validation;
//
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
//import lombok.extern.slf4j.Slf4j;
//
///**
// * Created by lb on 2020/5/9.
// */
//@Slf4j
//@RestController
//public class HelloController {
//
//    @RequestMapping("/valid")
//    public User valid(@RequestBody @Valid User user) {
//        log.info(user.toString());
//        return user;
//    }
//
//    @RequestMapping("/validated")
//    public User validated(@Validated User user) {
//        log.info(user.toString());
//        return user;
//    }
//}
