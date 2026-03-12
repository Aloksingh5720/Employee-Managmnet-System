package Ems.demo.DTO;

import Ems.demo.Entity.ENUM.AccountStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data

public class EmployeeCreateRepose {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    // user login

    private String roleName;
    private Long employeeId;
    private AccountStatus accountStatus;
    private LocalDateTime createdAt;
}
