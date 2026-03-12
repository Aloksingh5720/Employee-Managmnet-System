package Ems.demo.Controller;

import Ems.demo.DTO.EmployeeUpdateDto;
import Ems.demo.DTO.GetAllEmployeeDto;
import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.Employee;
import Ems.demo.Service.ServiceImpl.EmployeeManagmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeManagmentController {
    @Autowired
    EmployeeManagmentService employeeManagmentService;



// update employee status with user account status
    @PatchMapping("/employees/{employeeId}/status")
    public String updateStatus(
            @PathVariable Long employeeId,
            @RequestParam EmployeeStatus status
    ) {
        employeeManagmentService.updateStatus(employeeId, status);
        return "Status updated";
    }


    // user profile update
    @PatchMapping("updateEmployee/{id}")
    public String UpdateEmployee(@PathVariable long id , @RequestBody EmployeeUpdateDto updateEmployee){
        employeeManagmentService.updateEmployee(id ,updateEmployee);
        return "profile updated";


    }

    //get All Employeee
    @GetMapping("/getAllEmployee")
    public List<GetAllEmployeeDto> GetAllEmployee(){

    return     employeeManagmentService.GetAllEmployee();

    }


    //getEmployee by Id
    @GetMapping("/getEmployeeById/{id}")
    public GetAllEmployeeDto getEmployeeById(@PathVariable long id ){

      return   employeeManagmentService.getEmployeeById(id);



    }

    // Assign or Changer manager of the employee

    @PatchMapping("/AssignManagerToEmployee {employeeId}/{MangerId}")
    public String AssignManager(@PathVariable long managerId ,long employeeId ){


      return   employeeManagmentService.AssignMangerToEmployee(managerId, employeeId);
    }


// getAllTeamMember by manager
    @GetMapping("/getMyTeam")
    public List<Employee> getmanagerTeamMembers(){

      return   employeeManagmentService.getAllTeammeber();
    }


    // get my profile
    @GetMapping("/getmyProvide")
    public Employee getmyprofile(){


      return   employeeManagmentService.getmyprofile();
    }



}
