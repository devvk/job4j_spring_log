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
        log.error("Some error occured");
        log.warn ("Some warn occured");
        log.info ("Some info occured");
        log.debug("Some debug occured");
        log.trace("Some trace occured");
        return "Hello from Controller";
    }
}
