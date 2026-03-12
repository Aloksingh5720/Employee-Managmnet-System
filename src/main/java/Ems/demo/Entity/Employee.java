package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.EmployeeStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String empId;
private String firstName;
private String LastName;
private String phoneNumber;
private String address;
private LocalDate DateOfJoining;

@ManyToOne
@JoinColumn(name ="Dept_id")
   private Department department;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

   @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;


// bidrecional
    @OneToMany(mappedBy = "manager")
    private List<Employee> teamMembers;
    @OneToOne(mappedBy = "employee")
    private User user;







}
