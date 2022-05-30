package com.example.mapperlesson.my.convertor;

import com.example.mapperlesson.my.dto.DepartmentDto;
import com.example.mapperlesson.my.model.Department;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DepartmentConvertor {

    private final ModelMapper mapper;

    public DepartmentConvertor(@Qualifier("lmapper") ModelMapper mapper) {
        this.mapper = mapper;
    }

    public DepartmentDto convertToDto(Department entity){
       return mapper.map(entity, DepartmentDto.class);
    }

    public Department convertToEntity(DepartmentDto dto){
       return mapper.map(dto, Department.class);
    }
}
