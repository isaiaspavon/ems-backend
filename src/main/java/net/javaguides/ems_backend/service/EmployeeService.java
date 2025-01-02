package net.javaguides.ems_backend.service;

import net.javaguides.ems_backend.dto.EmployeeDto;

import java.util.List;

/**
 * Service Layer between Postman and DB
 * Postman <- DTO -> Controller Layer <-> Service Layer <-> Repository Layer <-> DB
 *
 * CREATES THE METHODS for the CRUD operations to be implemented in EmployeeServiceImpl
 */
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
