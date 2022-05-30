package com.example.mapperlesson.my.config;

import com.example.mapperlesson.my.dto.DepartmentDto;
import com.example.mapperlesson.my.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public DepartmentDto createDepartment(@RequestBody DepartmentDto dto){
        return departmentService.saveDepartment(dto);
    }
}
