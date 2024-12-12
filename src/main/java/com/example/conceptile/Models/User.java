package com.example.conceptile.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer Correct;
    private Integer Total;

    public Integer getUsrid() {
        return id;
    }

    public void setUsrid(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCorrect() {
        return Correct;
    }

    public void setCorrect() {
        this.Correct += 1;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal() {
        this.Total += 1;
    }

}


    

