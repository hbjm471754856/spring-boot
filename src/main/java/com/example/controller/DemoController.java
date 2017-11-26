package com.example.controller;

import com.example.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/usr")
    public String getUserName() {
        String str = "a";
        if (str.equals("a")) {
            DateUtil.getDate();
        }
        return "testing";
    }
}
