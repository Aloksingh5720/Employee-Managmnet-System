package Ems.demo.Entity;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3

import java.time.LocalDate;

@Entity
<<<<<<< HEAD
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Dept_Id;
    private String DepartmentName;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;
    private LocalDate CreatedAt;

<<<<<<< HEAD

=======
>>>>>>> 840969f0fa13d34c15139ea2722c362c10d32fa3
}
