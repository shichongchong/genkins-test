package springbootdome.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class HelloWorld {

    @RequestMapping(value = "/helloWorld")
    public String helloWorld(){
        return "helloWorld";
    }


}
