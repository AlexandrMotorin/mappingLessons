package com.example.mapperlesson.habr.model;

import com.example.mapperlesson.habr.attributes.Filling;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cupcakes")
@Setter
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Cupcake extends AbstractEntity{

    private Filling filling;

    @ManyToOne(fetch = FetchType.EAGER)
    private Droid droid;

    public Cupcake(Filling filling){
        this.filling = filling;
    }

    public Droid getDroid() {
        return droid;
    }

    public Filling getFilling() {
        return filling;
    }
}
