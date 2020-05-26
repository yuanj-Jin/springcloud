package com.yuanj.nacosproducer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value = "/seeyou/{name}", method = RequestMethod.GET)
    public String echo(@PathVariable String name) {
        return "see you tomorrow," + name;
    }
}
