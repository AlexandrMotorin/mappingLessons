package com.example.mapperlesson.my.controllers;

import com.example.mapperlesson.my.dto.EmployeeDto;
import com.example.mapperlesson.my.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDto> getAll(){
        return employeeService.getAll();
    }
}
