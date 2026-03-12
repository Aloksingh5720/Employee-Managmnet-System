package Ems.demo.DTO;

import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.ENUM.RoleType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeCreateRespose {



    private String name;

    private String phoneno;

    private String email;
    private LocalDate dateOfBirth;
    private String address;
    private LocalDate hireDate;
    private Double salary;
    private String department;

    private RoleType roleType;
    private EmployeeStatus status;



}
