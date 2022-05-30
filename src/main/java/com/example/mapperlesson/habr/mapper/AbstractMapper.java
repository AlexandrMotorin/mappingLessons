package com.example.mapperlesson.habr.mapper;

import com.example.mapperlesson.habr.dto.AbstractDto;
import com.example.mapperlesson.habr.model.AbstractEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Objects;

public abstract class AbstractMapper <E extends AbstractEntity, D extends AbstractDto> implements Mapper<E,D> {

    @Qualifier("lmapper")
    private ModelMapper mapper;

    private Class<E> entityClass;
    private Class<D> dtoClass;

    public AbstractMapper(Class<E> entityClass, Class<D> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @Override
    public E toEntity(D dto) {
        return Objects.isNull(dto)
                ? null
                : mapper.map(dto, entityClass);
    }

    @Override
    public D toDto(E entity) {
        return Objects.isNull(entity)
                ? null
                : mapper.map(entity, dtoClass);
    }


    Converter<E, D> toDtoConverter(){
       return context -> {
           E source = context.getSource();
           D destination = context.getDestination();
           mapSpecificFields(source, destination);
           return context.getDestination();
       };
    }

    void mapSpecificFields(E source, D destination) {

    }

}
