package com.theatre.theatre.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name="PRODUCTIONS")
@Entity
class Production {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long productionID;
    private String name;
    private String playwright;
    private String description;

    private Production() {}

    Production(String name, String playwright, String description) {
        this.name = name;
        this.playwright = playwright;
        this.description = description;
    }

}
