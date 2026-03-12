package Ems.demo.Mapper;

import Ems.demo.DTO.DepartmentCreateDto;
import Ems.demo.Entity.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {



    public Department  dtoToEnity(DepartmentCreateDto departmentCreateDto){


        Department dept = new Department();
        dept.setDepartmentName(departmentCreateDto.getDepartmentName());
        return dept;


    }

}
