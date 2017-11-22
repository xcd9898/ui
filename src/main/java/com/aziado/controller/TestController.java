package com.aziado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xucd on 2017/11/22.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/home")
    @ResponseBody
    String home() {
        System.out.println("call home");
        return "hell home!";
    }

    public static void main(String[] args) throws Exception {

    }
}
