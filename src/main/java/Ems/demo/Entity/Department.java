package Ems.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Dept_Id;
    private String DepartmentName;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;
    private LocalDate CreatedAt;


}
