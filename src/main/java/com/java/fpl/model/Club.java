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
@Table(name = "Club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String id_Club;
    
    public Date date_Club;
    
    public String name_Club;

    public String city_Code;


    public Club() {
    }

    public Club(Long id, String id_Club, Date date_Club, String name_Club, String city_Code) {
        this.id = id;
        this.id_Club = id_Club;
        this.date_Club = date_Club;
        this.name_Club = name_Club;
        this.city_Code = city_Code;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_Club() {
        return this.id_Club;
    }

    public void setId_Club(String id_Club) {
        this.id_Club = id_Club;
    }

    public Date getDate_Club() {
        return this.date_Club;
    }

    public void setDate_Club(Date date_Club) {
        this.date_Club = date_Club;
    }

    public String getName_Club() {
        return this.name_Club;
    }

    public void setName_Club(String name_Club) {
        this.name_Club = name_Club;
    }

    public String getCity_Code() {
        return this.city_Code;
    }

    public void setCity_Code(String city_Code) {
        this.city_Code = city_Code;
    }

}