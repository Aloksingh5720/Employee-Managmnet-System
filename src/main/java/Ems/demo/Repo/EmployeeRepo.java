package Ems.demo.Repo;

import Ems.demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Long> {


<<<<<<< HEAD
    public Employee findByFirstName(String firstName);


    Object findByManager(Employee manager);
=======
    public Employee findByName(String name);

    void deleteByName(String name);
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
}
