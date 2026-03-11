package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.LeaveStatus;
import Ems.demo.Entity.ENUM.LeaveType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class LeaveRequest {
    @Id
    private long leaveId;
    @ManyToOne
    @JoinColumn(name ="employee_id")
     private   Employee employee;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String Reason;
    @Enumerated (EnumType.STRING)

    private LeaveStatus leaveStatus;
    @Enumerated (EnumType.STRING)
    private LeaveType leaveType;
    private LocalDateTime CreatedAt;
    @ManyToOne
    @JoinColumn(name = "approved_by")
    private Employee approvedBy;
}
