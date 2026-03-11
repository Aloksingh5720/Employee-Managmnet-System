package Ems.demo.Repo;

import Ems.demo.Entity.ENUM.RoleType;
import Ems.demo.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByRoleName(RoleType roleType);
}
