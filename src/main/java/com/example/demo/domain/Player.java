package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by ram on 5/28/17.
 */
@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String position;


    public Player(String name, String position) {
        super();
        this.name = name;
        this.position = position;
    }

    public Player() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
