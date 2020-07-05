package com.binge.radoslaw.OracleJDBC.repository;

import com.binge.radoslaw.OracleJDBC.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByLogin(String login);

    Employee findByCurrentOn(String currentOn);

    List<Employee> findAllByOrderByLastNameAscFirstNameAsc();

}
