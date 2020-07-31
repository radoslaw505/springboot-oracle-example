package com.binge.radoslaw.OracleJDBC.repository;

import com.binge.radoslaw.OracleJDBC.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
