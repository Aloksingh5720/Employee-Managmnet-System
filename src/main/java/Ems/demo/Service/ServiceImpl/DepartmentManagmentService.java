package Ems.demo.Service.ServiceImpl;

import Ems.demo.DTO.DepartmentCreateDto;
import Ems.demo.Entity.Department;
import Ems.demo.Mapper.DepartmentMapper;
import Ems.demo.Repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DepartmentManagmentService {

    @Autowired
    DepartmentMapper deptmapper;

    @Autowired
    DepartmentRepo departmentRepo;


    public String createdDepartment(DepartmentCreateDto departmentname) {



  Department dept=  deptmapper.dtoToEnity(departmentname);
  dept.setCreatedAt(LocalDate.now());
  dept.setManager(null);
  departmentRepo.save(dept);
  return "department created";

    }
}
