package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.AccountStatus;
import jakarta.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "Role_id")
    private Role role;


    @OneToOne
    @JoinColumn(name = "employee_Id")
Employee employee;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    private LocalDateTime CreatedAt;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(new SimpleGrantedAuthority(role.getRoleName().name()));
    }

    @Override
    public String getUsername() {
        return this.email;
    }
}

