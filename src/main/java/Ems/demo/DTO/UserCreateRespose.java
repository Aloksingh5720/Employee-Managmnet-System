package Ems.demo.DTO;

import Ems.demo.Entity.ENUM.AccountStatus;
import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.ENUM.RoleType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserCreateRespose {


    private Long userId;
    private String email;
    private String roleName;
    private Long employeeId;
    private AccountStatus accountStatus;
    private LocalDateTime createdAt;



}
