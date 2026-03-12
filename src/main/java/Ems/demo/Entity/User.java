package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.AccountStatus;
import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements UserDetails {
=======

import java.time.LocalDateTime;

@Entity
public class User {
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String email;
<<<<<<< HEAD
    private String password;
=======
    private String Password;
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
    @ManyToOne
    @JoinColumn(name = "Role_id")
    private Role role;


    @OneToOne
    @JoinColumn(name = "employee_Id")
<<<<<<< HEAD
    Employee employee;
=======
Employee employee;
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    private LocalDateTime CreatedAt;


<<<<<<< HEAD
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(new SimpleGrantedAuthority(role.getRoleName().name()));
    }

    @Override
    public String getUsername() {
        return this.email;
    }
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
}

