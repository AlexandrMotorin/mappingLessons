package com.example.mapperlesson.habr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CupcakeDto extends AbstractDto{

    private String filling;
    private DroidDto droid;

}
