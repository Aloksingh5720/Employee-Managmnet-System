package Ems.demo.Repo;

import Ems.demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Long> {


    public Employee findByName(String name);

    void deleteByName(String name);
}
