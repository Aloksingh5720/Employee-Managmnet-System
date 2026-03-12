package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.EmployeeStatus;
<<<<<<< HEAD
=======
import Ems.demo.Entity.ENUM.RoleType;
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
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
<<<<<<< HEAD
private long id;

private String empId;
private String firstName;
private String LastName;
private String phoneNumber;
private String address;
=======

    private long EmpId;

    private String firstname;
    private String Lastname;
private String phoneNumber;
    private String address;
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
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
<<<<<<< HEAD
    @OneToOne(mappedBy = "employee")
    private User user;


=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3





}
