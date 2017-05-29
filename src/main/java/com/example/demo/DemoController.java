package com.example.demo;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ram on 5/28/17.
 */
@RestController
public class DemoController {

    @Autowired
    private TeamDao teamDao;



    @RequestMapping("/test/{name}")
    public Team getTeams(@PathVariable String name){

       return teamDao.findByName(name);

    }
}
