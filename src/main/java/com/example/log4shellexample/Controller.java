package com.example.log4shellexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam String s) {
        logger.info(s);
        return s;
    }
}
