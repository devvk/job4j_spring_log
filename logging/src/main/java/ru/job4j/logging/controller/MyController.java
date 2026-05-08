package ru.job4j.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class MyController {

    @ResponseBody
    @RequestMapping("/Hello")
    public String hello() {
        log.info("Hello from Controller");
        log.error("Some error occurred");
        log.warn ("Some warn occurred");
        log.info ("Some info occurred");
        log.debug("Some debug occurred");
        log.trace("Some trace occurred");
        return "Hello from Controller";
    }
}
