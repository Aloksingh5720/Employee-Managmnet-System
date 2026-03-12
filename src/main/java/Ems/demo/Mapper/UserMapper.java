package Ems.demo.Mapper;

import Ems.demo.DTO.EmployeeCreateRepose;
import Ems.demo.DTO.EmployeeCreateRequestDto;
import Ems.demo.Entity.Employee;
import Ems.demo.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public User dtoToUser(EmployeeCreateRequestDto req) {

        User user = new User();
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());
        return user;
    }
    // send employee repose

    public EmployeeCreateRepose EntitytoDto(User user, Employee employee) {


        EmployeeCreateRepose repose = new EmployeeCreateRepose();

        repose.setCreatedAt(user.getCreatedAt());
        repose.setAccountStatus(user.getAccountStatus());
        repose.setRoleName(user.getRole().toString());
        repose.setEmployeeId(Long.valueOf(user.getEmployee().getEmpId()));
        repose.setFirstName(employee.getFirstName());
        repose.setLastName(employee.getLastName());
        repose.setPhoneNumber(employee.getPhoneNumber());
        repose.setAddress(employee.getAddress());
        return repose;


    }
}
