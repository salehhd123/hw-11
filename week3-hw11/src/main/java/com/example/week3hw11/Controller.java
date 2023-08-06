package com.example.week3hw11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/name")
    public String name(){
        return "my name is saleh ";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "my age is 23";
    }
    @GetMapping(path = "/check/status")
    public String check(){
        return "Everything is okay !!!!!";
    }
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }

String []names ={"saleh","abdullah","alshehri"};
    @GetMapping(path="/names")
    public String[] names(){
        return names;
    }






}
