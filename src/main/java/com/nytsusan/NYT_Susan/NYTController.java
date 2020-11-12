package com.nytsusan.NYT_Susan;

//https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=yourkey
//arts, home, science, us, world

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
public class NYTController {

//    public static final String template = " Hello, %s!";
//    //%s is placeholder
//    //s indicates that it is a place holder for a string
//    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/stories")
    public NYTTopStories topStories(){
        return new NYTTopStories();
    }


}
