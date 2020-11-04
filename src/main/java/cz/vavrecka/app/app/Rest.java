package cz.vavrecka.app.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {


    @GetMapping
    public String hello(){
        return "hello";
    }


}
