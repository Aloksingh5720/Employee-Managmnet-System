package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.AccountStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String email;
    private String Password;
    @ManyToOne
    @JoinColumn(name = "Role_id")
    private Role role;


    @OneToOne
    @JoinColumn(name = "employee_Id")
Employee employee;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    private LocalDateTime CreatedAt;


}

