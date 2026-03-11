package Ems.demo.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreateRequest {



    private String email;
    private String password;

    private String firstName;
    private String lastName;
    private String phoneNumber;

}
