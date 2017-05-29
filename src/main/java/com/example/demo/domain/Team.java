package com.example.demo.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

/**
 * Created by ram on 5/28/17.
 */

@XmlRootElement
@Entity
public class Team {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String location;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<Player> players;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Team(String name, String location, Set<Player> players) {
        super();
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public Team() {
        super();
    }
}
