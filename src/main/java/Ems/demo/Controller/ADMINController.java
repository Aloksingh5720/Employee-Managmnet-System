package Ems.demo.Controller;

import Ems.demo.DTO.EmployeeCreateDto;
import Ems.demo.DTO.EmployeeCreateRespose;
import Ems.demo.Entity.ENUM.EmployeeStatus;
import Ems.demo.Entity.Employee;
import Ems.demo.Service.ServiceImpl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class ADMINController {
    public ADMINController(AdminService adminService) {
        this.adminService = adminService;
    }

    AdminService adminService;

    @PostMapping("/addemployee")
    public EmployeeCreateRespose AddEmployee (@RequestBody EmployeeCreateDto emp){


       return adminService.createEmployee(  emp );

    }

    @GetMapping("/AllEmp")

    public List<Employee> getAllemployee(){


        return  adminService.getallEmployee();
    }


    @GetMapping("/getById/{id}")
    public Employee getById(@PathVariable long id){

        return  adminService.getById(id);
    }
    @GetMapping("/getbyName/{name}")
    public Employee getByName(@PathVariable String name){

        return  adminService.getByName(name);
    }


    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable long id){

        return  adminService.DeleteById(id);
    }





    @DeleteMapping("/DeleteByname/{name}")
    public String deletebyname(@PathVariable String name ){

        return  adminService.deletebyName(name);
    }





    @PatchMapping("/inactive/{id}/status")
    public String updateEmployeeStatus(@PathVariable long id , @RequestParam EmployeeStatus status){

      return   adminService.updateEmployeeStatus(id,status);




    }







}







