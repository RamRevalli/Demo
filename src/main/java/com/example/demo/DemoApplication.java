package com.example.demo;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	@Autowired
    TeamDao teamDao;
    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

    @PostConstruct
    public void init(){
        Set<Player> players = new HashSet<>();
        players.add(new Player("Rammohan Revalli","pitcher"));
        players.add(new Player("Ribhav Sai Ramanuja","pitcher"));
        Team team = new Team("Phillies","Philadelphia",players);
        teamDao.save(team);
    }
}
