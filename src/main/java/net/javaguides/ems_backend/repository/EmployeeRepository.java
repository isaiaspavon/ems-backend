package net.javaguides.ems_backend.repository;

import net.javaguides.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is the Employee Repository to perform CRUD operations.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
