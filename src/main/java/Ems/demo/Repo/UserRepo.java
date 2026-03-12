package Ems.demo.Repo;

<<<<<<< HEAD
import Ems.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String email);
=======
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserRepo,Long> {
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
}
