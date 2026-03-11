package Ems.demo.Entity;

import Ems.demo.Entity.ENUM.RoleType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;

    @Enumerated(EnumType.STRING)
    private RoleType roleName;

@OneToMany(mappedBy = "role")
    private List<User> userList;

}
