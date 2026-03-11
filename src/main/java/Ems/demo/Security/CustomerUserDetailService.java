package Ems.demo.Security;

import Ems.demo.Entity.User;
import Ems.demo.Repo.EmployeeRepo;
import Ems.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Component;

@Component
public class CustomerUserDetailService implements UserDetailsService {

    @Autowired
   EmployeeRepo employeeRepo;
    @Autowired
UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

   User user= userRepo.findByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }

        return user;

    }
}
