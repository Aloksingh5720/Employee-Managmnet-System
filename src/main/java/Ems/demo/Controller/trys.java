package Ems.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/try")
public class trys {


    @GetMapping("/alok")
    public String send(){

        return "hello ji admin";
    }
}
