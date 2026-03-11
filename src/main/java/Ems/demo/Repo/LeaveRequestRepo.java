package Ems.demo.Repo;

import Ems.demo.Entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepo extends JpaRepository<LeaveRequest ,Long> {
}
