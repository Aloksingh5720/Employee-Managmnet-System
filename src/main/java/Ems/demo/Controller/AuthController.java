package Ems.demo.Controller;

import Ems.demo.DTO.*;
import Ems.demo.Service.ServiceImpl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
@Autowired
private AuthService authService;
    @PostMapping("/create")
    public EmployeeCreateRepose createEmployee(@RequestBody EmployeeCreateRequestDto request){


        return authService.createuser(request);
    }



    @PostMapping("/login")
    public AuthLoginRespose Login (@RequestBody AuthloginRequest loginRequest){


      return   authService.Login(loginRequest);

    }


}
