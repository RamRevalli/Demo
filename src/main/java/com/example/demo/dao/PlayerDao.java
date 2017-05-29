package com.example.demo.dao;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by ram on 5/28/17.
 */
@RestResource(path="players", rel="players")
public interface PlayerDao extends CrudRepository<Player, Long> {

}
