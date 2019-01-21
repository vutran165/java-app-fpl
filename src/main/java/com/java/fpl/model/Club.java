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
@Table(name = "Club")
public class Club {

    @Id
    // @GeneratedValue(strategy = )
    public String id_Club;
    
    public Date date_Club;

}