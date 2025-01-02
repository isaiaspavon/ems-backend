package net.javaguides.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

// JPA Employee Annotations
/**
 * Represents an Employee entity mapped to the "employees" table in the DB.
 * This class is annotated with JPA and Lombok annotations to simplify its implementation.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity // specifies a class as a JP entity
@Table(name = "employees")
public class Employee {

    /**
     * The unique identifier for the Employee.
     * Primary key of the "employees" table and is automatically generated.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically implements the primary
    private Long id;

    /**
     * The first name of the Employee.
     * Mapped to the "first_name" column in the DB
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * The last name of the Employee.
     * Mapped to the "last_name" column in the DB.
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * The email address of the Employe.
     * Mapped to the "email_id" column in the DB.
     * This field is mandatory (not null) and must be unique.
     */
    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}
