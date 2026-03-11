package Ems.demo.Mapper;

import Ems.demo.DTO.UserCreateRequest;
import Ems.demo.DTO.UserCreateRespose;
import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {


        public  Employee toEmployee(UserCreateRequest request){

            Employee employee = new Employee();

            employee.setFirstName(request.getFirstName());
            employee.setLastName(request.getLastName());
            employee.setPhoneNumber(request.getPhoneNumber());
            employee.setEmployeeStatus(EmployeeStatus.ACTIVE);
            employee.setFirstName(request.getFirstName());
            employee.setLastName(request.getLastName());

            return employee;
        }
    }


