package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping(path = "/add/{num3}/and/{num4}")
    @ResponseBody
    public String add(@PathVariable int num3, @PathVariable int num4) {
        return num3 + " + " + num4 + " = " + (num3 + num4);
    }

    @GetMapping(path = "/subtract/{num1}/from/{num10}")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num10) {
        return num10 + " - " + num1 + " = " + (num10 - num1);
    }

    @GetMapping(path = "/multiply/{num4}/and/{num5}")
    @ResponseBody
    public String multiply(@PathVariable int num4, @PathVariable int num5) {
        return num4 + " * " + num5 + " = " + (num4 * num5);
    }

    @GetMapping(path = "/divide/{num6}/by/{num3}")
    @ResponseBody
    public String divide(@PathVariable int num6, @PathVariable int num3) {
        return num3 + " / " + num6 + " = " + (num6 / num3);
    }

}