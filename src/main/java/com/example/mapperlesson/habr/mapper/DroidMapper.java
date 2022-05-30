package com.example.mapperlesson.habr.mapper;

import com.example.mapperlesson.habr.UnicornRepo;
import com.example.mapperlesson.habr.dto.DroidDto;
import com.example.mapperlesson.habr.model.Droid;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;

@Component
public class DroidMapper extends AbstractMapper<Droid, DroidDto>{

    private final ModelMapper mapper;
    private final UnicornRepo unicornRepo;

    public DroidMapper(ModelMapper modelMapper, UnicornRepo unicornRepo) {
        super(Droid.class, DroidDto.class);
        this.mapper = modelMapper;
        this.unicornRepo = unicornRepo;
    }

    @PostConstruct
    public void setupMapper(){
        mapper.createTypeMap(Droid.class, DroidDto.class)
                .addMappings(m -> m.skip(DroidDto::setUnicornId)).setPostConverter(toDtoConverter());
    }

    @Override
    void mapSpecificFields(Droid source, DroidDto destination) {
        destination.setUnicornId(getId(source));
    }

    private Long getId(Droid source){
        return Objects.isNull(source) || Objects.isNull(source.getId()) ? null : source.getUnicorn().getId();
    }
}
