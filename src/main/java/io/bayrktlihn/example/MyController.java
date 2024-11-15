package io.bayrktlihn.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MyController {


    @GetMapping("")
    public void exception(){
        throw new RuntimeException("");
    }

}
