package Ems.demo.DTO;

import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.ENUM.RoleType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeCreateDto {


    private String name;

    private String phoneno;

    private String email;
    private LocalDate dateOfBirth;
    private String address;
    private LocalDate hireDate;
    private Double salary;
    private String department;






}
