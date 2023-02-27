package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;

import java.util.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }


    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayhello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return String.format("%d plus 1 is %d!", number, number + 1);
    }

    @GetMapping("/exponent/{num}/{pow}")
    @ResponseBody
    public String exponent(@PathVariable int num, @PathVariable int pow) {
        return String.format("%d raised to the power %d gives the result of %d.", num, pow, (int) (Math.pow(num, pow)));
    }

    @GetMapping("/")
    @ResponseBody
    public String landingPage() {
        return "This is the landing page!";
    }

    record Message(String message) {
    }

        @GetMapping(path = "/hello/{name}")
        public String helloWorld(@PathVariable String name, Model model) {
            model.addAttribute("name", name);
            return "hello";
        }

        @GetMapping("/join")
        public String showJoinForm() {
            return "join";
        }

        @PostMapping("/join")
        public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
            model.addAttribute("cohort", "Welcome to " + cohort + "!");
            return "join";
        }
    }


