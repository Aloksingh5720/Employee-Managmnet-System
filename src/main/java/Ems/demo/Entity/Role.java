package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.RoleType;
import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3

import java.util.List;

@Entity
<<<<<<< HEAD
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;

    @Enumerated(EnumType.STRING)
    private RoleType roleName;

@OneToMany(mappedBy = "role")
    private List<User> userList;

<<<<<<< HEAD

=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
}
