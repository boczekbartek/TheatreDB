package com.greglturnquist.payroll;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by bartek on 13.06.17.
 */
@Data
@Table(name = "PROFESSIONS")
@Entity
public class Profession {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long professionID;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Profession(){};


    public Profession(String name){
        this.name = name;
    }
}
