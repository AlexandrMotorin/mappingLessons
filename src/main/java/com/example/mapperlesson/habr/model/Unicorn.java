package com.example.mapperlesson.habr.model;

import com.example.mapperlesson.habr.attributes.Color;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "unicorns")
public class Unicorn extends AbstractEntity{

    private String name;

    @OneToMany(mappedBy = "unicorn", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Droid> droids;

    @Enumerated(EnumType.STRING)
    private Color color;

    public String getName() {
        return name;
    }

    public List<Droid> getDroids() {
        return droids;
    }

    public Color getColor() {
        return color;
    }
}
