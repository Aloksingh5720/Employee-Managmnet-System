package Ems.demo.Controller;

import Ems.demo.DTO.DepartmentCreateDto;
import Ems.demo.Service.ServiceImpl.DepartmentManagmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentManagmentController {

DepartmentManagmentService  departmentManagmentService;


// create department
    @PostMapping("/createDepartment/{departmentName}")
    public String createDepartment(@PathVariable DepartmentCreateDto departmentname){

       return departmentManagmentService.createdDepartment(departmentname);


    }

    // getDepartment with manager name and total count
    @GetMapping("/")




}
