package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;

/**
 * Converts between Employee entities and EmployeeDto instances
 * Separates the data model used by the DB from the data exchanged with the client
 */
public class EmployeeMapper {

    /**
     * Converts an Employee entity (DB rows) to an EmployeeDto object (transferring data to the client).
     *
     * @param employee the Employee entity to be converted
     * @return the corresponding EmployeeDto
     */
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    /**
     * Converts an EmployeeDto to an Employee entity.
     *
     * @param employeeDto the EmployeeDto to be converted
     * @return the corresponding Employee entity
     */
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
