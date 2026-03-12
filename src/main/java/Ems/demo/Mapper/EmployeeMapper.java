package Ems.demo.Mapper;

import Ems.demo.DTO.EmployeeCreateRequestDto;
import Ems.demo.DTO.EmployeeUpdateDto;
import Ems.demo.DTO.GetAllEmployeeDto;
import Ems.demo.Entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {


        public  Employee toEmployee(EmployeeCreateRequestDto request){

            Employee employee = new Employee();

            employee.setFirstName(request.getFirstName());
            employee.setLastName(request.getLastName());
            employee.setPhoneNumber(request.getPhoneNumber());
      employee.setAddress(request.getAddress());




            return employee;
        }



        // employee update mapper


    public Employee updateEmployee(EmployeeUpdateDto update, Employee employee){

            employee.setFirstName(update.getFirstName());
        employee.setLastName(update.getLastName());
          employee.setPhoneNumber(update.getPhoneNumber());
            employee.setAddress(update.getAddress());



            return employee;


    }



    ///  get employee by id mapper

    public GetAllEmployeeDto enittyToDto(Employee emp){

        GetAllEmployeeDto dto = new GetAllEmployeeDto();

        dto.setEmpId(emp.getEmpId());
        dto.setFirstName(emp.getFirstName());
        dto.setLastName(emp.getLastName());
        dto.setPhoneNumber(emp.getPhoneNumber());
        dto.setAddress(emp.getAddress());
        dto.setDateOfJoining(emp.getDateOfJoining());

        if(emp.getUser() != null){
            dto.setEmail(emp.getUser().getEmail());
        }

        if(emp.getDepartment() != null){
            dto.setDepartmentName(emp.getDepartment().getDepartmentName());
        }

        if(emp.getManager() != null){
            dto.setManagerName(emp.getManager().getFirstName());
        }

        dto.setEmployeeStatus(emp.getEmployeeStatus());

        return dto;
    }
    }


