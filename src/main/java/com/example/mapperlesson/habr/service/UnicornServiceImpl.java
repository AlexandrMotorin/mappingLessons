package com.example.mapperlesson.habr.service;

import com.example.mapperlesson.habr.UnicornRepo;
import com.example.mapperlesson.habr.dto.UnicornDto;
import com.example.mapperlesson.habr.mapper.UnicornMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UnicornServiceImpl implements UnicornService {

    private final UnicornRepo repository;
    private final UnicornMapper mapper;

    @Override
    @Transactional
    public UnicornDto save(UnicornDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public UnicornDto get(Long id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }
}
