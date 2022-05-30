package com.example.mapperlesson.my.dao;

import com.example.mapperlesson.my.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {


}
