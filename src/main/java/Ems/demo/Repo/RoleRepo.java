package Ems.demo.Repo;

<<<<<<< HEAD
import Ems.demo.Entity.ENUM.RoleType;
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
import Ems.demo.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
<<<<<<< HEAD

    Role findByRoleName(RoleType roleType);
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
}
