package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @GetMapping("welcome")
    public String welcome(){

        return "Hi Jenkins";
        }


        @GetMapping("hi")
        public String Hi(){
        return "HI Naveen";
        }

        //added comments for maven

    }

