package Ems.demo.DTO;

import Ems.demo.Entity.ENUM.EmployeeStatus;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeeDto {
        private String empId;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String address;
        private LocalDate dateOfJoining;

        private String departmentName;
        private String managerName;

        private EmployeeStatus employeeStatus;

        private String email;
    }


