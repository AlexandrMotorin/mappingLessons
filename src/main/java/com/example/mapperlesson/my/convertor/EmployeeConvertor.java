package com.example.mapperlesson.my.convertor;

import com.example.mapperlesson.my.dto.EmployeeDto;
import com.example.mapperlesson.my.model.Employee;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConvertor {

    private final ModelMapper mapper;

    public EmployeeConvertor( @Qualifier("lmapper") ModelMapper mapper) {
        this.mapper = mapper;
    }

    public EmployeeDto convertToDto(Employee entity){
        return mapper.map(entity, EmployeeDto.class);
    }
}
