package com.example.mapperlesson.habr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DroidDto extends AbstractDto {

    private String name;
    private List<CupcakeDto> cupcakes;
    private Long unicornId;
    private Boolean alive;

}
