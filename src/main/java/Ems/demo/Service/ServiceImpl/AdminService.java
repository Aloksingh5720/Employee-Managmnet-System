//package Ems.demo.Service.ServiceImpl;
//
//import Ems.demo.DTO.UserCreateRequest;
//import Ems.demo.DTO.UserCreateRespose;
//import Ems.demo.Entity.ENUM.EmployeeStatus;
//import Ems.demo.Entity.ENUM.RoleType;
//import Ems.demo.Entity.Employee;
//import Ems.demo.Mapper.EmployeeMapper;
//import Ems.demo.Repo.EmployeeRepo;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//
//public class AdminService {
//
//
//    EmployeeMapper employeeMapper;
//
//
//
//
//    EmployeeRepo employeeRepo;
//
//    public AdminService(EmployeeRepo employeeRepo,EmployeeMapper employeeMapper) {
//        this.employeeRepo = employeeRepo;
//        this.employeeMapper = employeeMapper;
//    }
//
//    public UserCreateRespose createEmployee(UserCreateRequest dtoem) {
//
//
//      Employee emp = employeeMapper.toEntity(dtoem);
//
//      // default all employee are active
//      emp.setStatus(EmployeeStatus.ACTIVE);
//
//        // default all employee are active
//      emp.setRoleType(RoleType.ROLE_EMPLOYEE);
//
//     Employee saveEmployee =  employeeRepo.save(emp);
//
//
//     return  employeeMapper.toDto(saveEmployee);
//
//
//    }
//
//    // getallEmployee
//
//    public List<Employee> getallEmployee() {
//
//
//       return employeeRepo.findAll();
//    }
//
//
//
//    // find by id
//    public Employee getById(long id) {
//
//
//      return   employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("user not found ") );
//    }
//
//    public Employee getByName(String name) {
//
//     return    employeeRepo.findByName(name);
//    }
//
//
//    // delete by id
//    public String DeleteById(long id) {
//        if(employeeRepo.findById(id).isPresent()){
//
//
//            employeeRepo.deleteById(id);
//            return "deleted";
//        }
//        return "employee not found";
//
//    }
//
//
//
//
//
//
//
////delete by name
//    public String deletebyName(String name) {
//
//Employee e = employeeRepo.findByName(name);
//if(e!=null){
//
//
//    employeeRepo.deleteByName(name);
//    return "deleted";
//}
//
//
//return "employee not found";
//    }
//
//
//    public String  updateEmployeeStatus (long id, EmployeeStatus status) {
//
//
//
//       Employee emp= employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
//       emp.setStatus(status);
//       employeeRepo.save(emp);
//       return "user status changed";
//    }
//
//
//
//
//}
