package com.example.mapperlesson.habr.mapper;

import com.example.mapperlesson.habr.dto.UnicornDto;
import com.example.mapperlesson.habr.model.Unicorn;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UnicornMapper extends AbstractMapper<Unicorn, UnicornDto> {


    public UnicornMapper(Class<Unicorn> entityClass, Class<UnicornDto> dtoClass) {
        super(entityClass, dtoClass);
    }
}
