package com.example.mapperlesson.my.service;

import com.example.mapperlesson.my.convertor.DepartmentConvertor;
import com.example.mapperlesson.my.dao.DepartmentRepo;
import com.example.mapperlesson.my.dto.DepartmentDto;
import com.example.mapperlesson.my.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepo departmentRepo;
    private final DepartmentConvertor convertor;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto dto) {
        Department department = convertor.convertToEntity(dto);

        Department created = departmentRepo.save(department);
        return convertor.convertToDto(created);
    }
}
