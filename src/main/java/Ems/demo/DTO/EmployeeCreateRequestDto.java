package Ems.demo.DTO;

import lombok.*;

@Data

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmployeeCreateRequestDto {






        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String address;

        // user login
        private String email;
        private String password;

    }

