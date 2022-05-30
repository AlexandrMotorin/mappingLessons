package com.example.mapperlesson.my.dao;

import com.example.mapperlesson.my.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee, Long> {
}
