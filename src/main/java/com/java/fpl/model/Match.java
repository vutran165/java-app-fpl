package com.java.fpl.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    // @GeneratedValue(strategy = )
    public String id_Match;
    
    public Date date_Match;

    public String home_team;

    public String away_team;
    
}