package com.bing.lan.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ValidationSamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidationSamplesApplication.class, args);

        ValidationSamplesApplication application = new ValidationSamplesApplication();
    }

    public void valid(@Valid User user) {
        log.info(user.toString());
    }

    public void validated(@Validated User user) {
        log.info(user.toString());
    }
}
