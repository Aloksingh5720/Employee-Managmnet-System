package Ems.demo.Mapper;

import Ems.demo.DTO.UserCreateRequest;
import Ems.demo.DTO.UserCreateRespose;
import Ems.demo.Entity.User;
import Ems.demo.Security.SecurityConfig;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public User dtoToUser(UserCreateRequest req){

        User user = new User();
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());

        return  user;



    }







    public UserCreateRespose EntitytoDto(User user){


        UserCreateRespose userC = new UserCreateRespose();
        userC.setUserId(user.getUserId());
        userC.setEmail(user.getEmail());
        userC.setCreatedAt(user.getCreatedAt());
        userC.setAccountStatus(user.getAccountStatus());
        userC.setRoleName(user.getRole().toString());
        userC.setEmployeeId(user.getEmployee().getEmpId());

        return  userC;






    }
}
