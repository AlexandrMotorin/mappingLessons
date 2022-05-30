package com.example.mapperlesson.habr.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "droids")
@AllArgsConstructor
@NoArgsConstructor
public class Droid extends AbstractEntity {

    private String name;

    @ManyToOne
    private Unicorn unicorn;

    @OneToMany(mappedBy = "droid", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Cupcake> cupcakes;

    private Boolean  alive;


    public String getName() {
        return name;
    }

    public Unicorn getUnicorn() {
        return unicorn;
    }

    public List<Cupcake> getCupcakes() {
        return cupcakes;
    }

    public Boolean getAlive() {
        return alive;
    }
}

