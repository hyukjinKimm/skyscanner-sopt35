package sopt35.skyscanner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthy")
public class TestController {

    @GetMapping("/")
    public String test() {
        return "I'M HEALTHY!";
    }
    
    빌드를 깨자!

}
