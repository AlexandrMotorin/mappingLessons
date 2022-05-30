package com.example.mapperlesson.my.service;

import com.example.mapperlesson.my.convertor.EmployeeConvertor;
import com.example.mapperlesson.my.dao.EmployeeRepo;
import com.example.mapperlesson.my.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.*;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo repo;
    private final EmployeeConvertor convertor;

    @Override
    public List<EmployeeDto> getAll() {
        return repo.findAll().stream()
                .map(convertor::convertToDto)
                .collect(toList());
    }
}
