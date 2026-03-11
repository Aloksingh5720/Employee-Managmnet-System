package Ems.demo.Service.ServiceImpl;

import Ems.demo.DTO.AuthLoginRespose;
import Ems.demo.DTO.AuthloginRequest;
import Ems.demo.DTO.UserCreateRequest;
import Ems.demo.DTO.UserCreateRespose;
import Ems.demo.Entity.ENUM.AccountStatus;
import Ems.demo.Entity.ENUM.RoleType;
import Ems.demo.Entity.Employee;
import Ems.demo.Entity.Role;
import Ems.demo.Entity.User;
import Ems.demo.Mapper.EmployeeMapper;
import Ems.demo.Mapper.UserMapper;
import Ems.demo.Repo.EmployeeRepo;
import Ems.demo.Repo.RoleRepo;
import Ems.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthService {
    @Autowired
RoleRepo roleRepo;
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
EmployeeMapper employeeMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepo userRepo;
    @Autowired
    private AuthenticationManager authenticationManager;

    public UserCreateRespose createuser(UserCreateRequest request) {


        Role role =  roleRepo.findByRoleName(RoleType.ROLE_EMPLOYEE);

        Employee employee = employeeMapper.toEmployee(request);

        employeeRepo.save(employee);

        User user = userMapper.dtoToUser(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(role);
        user.setCreatedAt(LocalDateTime.now());
        user.setAccountStatus(AccountStatus.ACTIVE);
        user.setEmployee(employee);

        User saveduser =userRepo.save(user); // why here error


        return  userMapper.EntitytoDto(saveduser);





    }


    public AuthLoginRespose Login(AuthloginRequest loginRequest) {

        Authentication authentication =
              authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                loginRequest.getEmail(),
                                loginRequest.getPassword()
                        )
                );


        // extact the user from authcation tocken
        User user = (User) authentication.getPrincipal();

        AuthLoginRespose response = new AuthLoginRespose();
        response.setEmail(user.getEmail());
        response.setRole(user.getRole().getRoleName().name());

        return response;


    }
}
