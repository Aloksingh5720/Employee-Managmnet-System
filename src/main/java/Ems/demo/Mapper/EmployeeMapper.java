package Ems.demo.Mapper;

import Ems.demo.DTO.EmployeeCreateDto;
import Ems.demo.DTO.EmployeeCreateRespose;
import Ems.demo.Entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {



    public Employee toEntity(EmployeeCreateDto dtoemp){

        Employee emp1 = new Employee();
        emp1.setName(dtoemp.getName());
        emp1.setEmail(dtoemp.getEmail());
        emp1.setAddress(dtoemp.getAddress());
        emp1.setDepartment(dtoemp.getDepartment());
        emp1.setPhoneno(dtoemp.getPhoneno());
        emp1.setDateOfBirth(dtoemp.getDateOfBirth());

        emp1.setSalary(dtoemp.getSalary());
        emp1.setHireDate(dtoemp.getHireDate());

        return emp1;


    }



    public EmployeeCreateRespose toDto(Employee employee){


        EmployeeCreateRespose res = new EmployeeCreateRespose();

        res.setName(employee.getName());
        res.setEmail(employee.getEmail());
        res.setAddress(employee.getAddress());
        res.setDepartment(employee.getDepartment());
        res.setPhoneno(employee.getPhoneno());
        res.setDateOfBirth(employee.getDateOfBirth());
        res.setStatus(employee.getStatus());
        res.setSalary(employee.getSalary());
        res.setRoleType(employee.getRoleType());
        res.setHireDate(employee.getHireDate());

        return  res;

    }
}
