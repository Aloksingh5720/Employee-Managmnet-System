package Ems.demo.Service.ServiceImpl;

import Ems.demo.DTO.EmployeeUpdateDto;
import Ems.demo.DTO.GetAllEmployeeDto;
import Ems.demo.Entity.ENUM.AccountStatus;
import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.ENUM.RoleType;
import Ems.demo.Entity.Employee;
import Ems.demo.Entity.User;
import Ems.demo.Mapper.EmployeeMapper;
import Ems.demo.Repo.EmployeeRepo;
import Ems.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeManagmentService {
    @Autowired

    EmployeeRepo employeeRepo;
    UserRepo userRepo;
    EmployeeMapper employeeMapper;

// update employee status
    public String updateStatus(Long employeeId, EmployeeStatus status) {

        Employee employee =employeeRepo.findById(employeeId).orElseThrow(()-> new RuntimeException("employee not found"));


        employee.setEmployeeStatus(status);
    User user = employee.getUser();
             if (status == EmployeeStatus.ACTIVE) {
                 user.setAccountStatus(AccountStatus.ACTIVE);

             }else{
                 user.setAccountStatus(AccountStatus.INACTIVE);
             }
        employeeRepo.save(employee);
        userRepo.save(user);

        return "employee status updated";
    }
 // update employeee

    public void updateEmployee(long id ,EmployeeUpdateDto updateEmployee) {
       Employee emp = employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));

          Employee employee1= employeeMapper.updateEmployee(updateEmployee,emp);
          employeeRepo.save(employee1);


    }
    ///  get All employeee

    public List<GetAllEmployeeDto> GetAllEmployee() {

        List<Employee> employeeList = employeeRepo.findAll();

        List<GetAllEmployeeDto> response = new ArrayList<>();


        for(Employee  emp : employeeList){
            GetAllEmployeeDto getAllEmployeeDto = new GetAllEmployeeDto();

            getAllEmployeeDto.setEmpId(emp.getEmpId());
            getAllEmployeeDto.setFirstName(emp.getFirstName());
            getAllEmployeeDto.setLastName(emp.getLastName());
            getAllEmployeeDto.setPhoneNumber(emp.getPhoneNumber());
            getAllEmployeeDto.setAddress(emp.getAddress());
            getAllEmployeeDto.setEmail(emp.getUser().getEmail());

            getAllEmployeeDto.setDateOfJoining(emp.getDateOfJoining());

            getAllEmployeeDto.setDepartmentName(emp.getDepartment().getDepartmentName());
            getAllEmployeeDto.setManagerName(emp.getManager().getFirstName());

            getAllEmployeeDto.setEmployeeStatus(emp.getEmployeeStatus());



            response.add(getAllEmployeeDto);




        }

return response;
    }

    public GetAllEmployeeDto getEmployeeById(long id) {


      Employee emp=  employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("employee not found"));

       return employeeMapper.enittyToDto(emp);
    }

    // Assign manager to Employee

    public String AssignMangerToEmployee(long managerId, long employeeId) {
        if(managerId == employeeId){
            throw new RuntimeException("Employee cannot be their own manager");
        }

     Employee emp=   employeeRepo.findById(employeeId).orElseThrow(()-> new RuntimeException("employee not found"));
       Employee manager = employeeRepo.findById(managerId).orElseThrow();


       if(manager.getUser() == null ||
               manager.getUser().getRole().getRoleName()!= RoleType.ROLE_MANAGER){
           throw (new RuntimeException("this employee is not manager"));


       }
     emp.setManager(manager);
       employeeRepo.save(emp);
       return "manager is assign to employee";


    }
///  get team member of the manager
    public List<Employee> getAllTeammeber() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
User user = (User) authentication.getPrincipal();
Employee manager = user.getEmployee();


return (List<Employee>) employeeRepo.findByManager(manager);

    }

// get my profile
    public Employee getmyprofile() {

        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();
         Employee employee1 = user.getEmployee();
         return employee1;

    }
}
