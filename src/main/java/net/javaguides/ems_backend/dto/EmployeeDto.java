package net.javaguides.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/**
 * Transfers data between client and server (Data Transfer Object)
 * Aids for building the RESTful services
 */
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
