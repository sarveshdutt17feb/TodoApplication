package com.lcwd.first.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @Value("${lcwd.profile.img.path}")
    private String profilePath;
    @RequestMapping("/todos")
    public List<String> justTest(){
        List<String> todos = Arrays.asList("Learn Java", "Learn SpringBoot", "Develop Project","Learn Nodejs","Learn Oops");
        return todos;
    }
    @RequestMapping("/profilePath")
    public String getProfilePath(){
        return profilePath;
    }

}
