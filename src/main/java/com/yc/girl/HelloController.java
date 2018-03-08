package com.yc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationEvent;

/**
 * hello world
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value="/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "2333") Integer myId) {
        return "id=" + myId;
    }
}
