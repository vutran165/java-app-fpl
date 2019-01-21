package com.java.fpl.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// import org.hibernate.annotations.Entity;

/**
 * Player
 */
@Entity
@Table(name = "Player")
public class Player {

    @Id
    // @GeneratedValue(strategy = )
    public String id_Player;
    public String name;
    public String club;
    public Integer age;
    public String position;
    public String position_cat;
    public Double market_value;
    public Integer page_views;
    public Double fpl_value;
    public Double fpl_sel;
    public Integer fpl_points;
    public String region;
    public Integer nationality;
    public String new_foreign;
    public String age_cat;
    public String club_id;
    public String big_club;
    public String new_signing;
    public Date date;
    
}