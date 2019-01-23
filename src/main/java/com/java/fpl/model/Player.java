package com.java.fpl.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
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
 

    public Player() {
    }

    public Player(Long id, String id_Player, String name, String club, Integer age, String position, String position_cat, Double market_value, Integer page_views, Double fpl_value, Double fpl_sel, Integer fpl_points, String region, Integer nationality, String new_foreign, String age_cat, String club_id, String big_club, String new_signing, Date date) {
        this.id = id;
        this.id_Player = id_Player;
        this.name = name;
        this.club = club;
        this.age = age;
        this.position = position;
        this.position_cat = position_cat;
        this.market_value = market_value;
        this.page_views = page_views;
        this.fpl_value = fpl_value;
        this.fpl_sel = fpl_sel;
        this.fpl_points = fpl_points;
        this.region = region;
        this.nationality = nationality;
        this.new_foreign = new_foreign;
        this.age_cat = age_cat;
        this.club_id = club_id;
        this.big_club = big_club;
        this.new_signing = new_signing;
        this.date = date;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_Player() {
        return this.id_Player;
    }

    public void setId_Player(String id_Player) {
        this.id_Player = id_Player;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition_cat() {
        return this.position_cat;
    }

    public void setPosition_cat(String position_cat) {
        this.position_cat = position_cat;
    }

    public Double getMarket_value() {
        return this.market_value;
    }

    public void setMarket_value(Double market_value) {
        this.market_value = market_value;
    }

    public Integer getPage_views() {
        return this.page_views;
    }

    public void setPage_views(Integer page_views) {
        this.page_views = page_views;
    }

    public Double getFpl_value() {
        return this.fpl_value;
    }

    public void setFpl_value(Double fpl_value) {
        this.fpl_value = fpl_value;
    }

    public Double getFpl_sel() {
        return this.fpl_sel;
    }

    public void setFpl_sel(Double fpl_sel) {
        this.fpl_sel = fpl_sel;
    }

    public Integer getFpl_points() {
        return this.fpl_points;
    }

    public void setFpl_points(Integer fpl_points) {
        this.fpl_points = fpl_points;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getNationality() {
        return this.nationality;
    }

    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }

    public String getNew_foreign() {
        return this.new_foreign;
    }

    public void setNew_foreign(String new_foreign) {
        this.new_foreign = new_foreign;
    }

    public String getAge_cat() {
        return this.age_cat;
    }

    public void setAge_cat(String age_cat) {
        this.age_cat = age_cat;
    }

    public String getClub_id() {
        return this.club_id;
    }

    public void setClub_id(String club_id) {
        this.club_id = club_id;
    }

    public String getBig_club() {
        return this.big_club;
    }

    public void setBig_club(String big_club) {
        this.big_club = big_club;
    }

    public String getNew_signing() {
        return this.new_signing;
    }

    public void setNew_signing(String new_signing) {
        this.new_signing = new_signing;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}