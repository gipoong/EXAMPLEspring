package org.gipoong.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
@Log4j
public class SampleController {

    @GetMapping("/home")
    public String home() {
        log.info("Welcome home!");
        return "home";
    }
}
