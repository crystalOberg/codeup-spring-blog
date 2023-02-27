package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "Posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable int id) {
        return "Individual post id is " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreateForm() {
        return "Post creation form";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String postCreateSubmit() {
        return "Create new post";
    }
}

