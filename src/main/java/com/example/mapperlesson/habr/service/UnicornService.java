package com.example.mapperlesson.habr.service;

import com.example.mapperlesson.habr.dto.UnicornDto;

public interface UnicornService {
    UnicornDto save(UnicornDto dto);
    UnicornDto get(Long id);
}
