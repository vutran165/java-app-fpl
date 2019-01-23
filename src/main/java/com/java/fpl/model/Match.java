package com.java.fpl.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// import org.hibernate.annotations.Entity;

/**
 * Player
 */
@Entity
@Table(name = "Match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String id_Match;
    
    public Date date_Match;

    public String home_team;

    public String away_team;

    public Match() {
    }

    

    public Match(Long id, String id_Match, Date date_Match, String home_team, String away_team) {
        this.id = id;
        this.id_Match = id_Match;
        this.date_Match = date_Match;
        this.home_team = home_team;
        this.away_team = away_team;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_Match() {
        return this.id_Match;
    }

    public void setId_Match(String id_Match) {
        this.id_Match = id_Match;
    }

    public Date getDate_Match() {
        return this.date_Match;
    }

    public void setDate_Match(Date date_Match) {
        this.date_Match = date_Match;
    }

    public String getHome_team() {
        return this.home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }

    public String getAway_team() {
        return this.away_team;
    }

    public void setAway_team(String away_team) {
        this.away_team = away_team;
    }


}