package Ems.demo.Mapper;

<<<<<<< HEAD
import Ems.demo.DTO.EmployeeCreateRequestDto;
import Ems.demo.DTO.EmployeeUpdateDto;
import Ems.demo.DTO.GetAllEmployeeDto;
=======
import Ems.demo.DTO.EmployeeCreateDto;
import Ems.demo.DTO.EmployeeCreateRespose;
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
import Ems.demo.Entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {


<<<<<<< HEAD
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
=======

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
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3


    }



<<<<<<< HEAD
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


=======
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
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
