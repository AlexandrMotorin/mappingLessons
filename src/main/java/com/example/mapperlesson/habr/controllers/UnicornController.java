package com.example.mapperlesson.habr.controllers;

import com.example.mapperlesson.habr.dto.UnicornDto;
import com.example.mapperlesson.habr.service.UnicornService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/unicorn")
public class UnicornController {

    private final UnicornService service;

    @GetMapping("/{id}")
    public UnicornDto getById(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public UnicornDto createUnicorn(@RequestBody UnicornDto dto){
        return service.save(dto);
    }

}
