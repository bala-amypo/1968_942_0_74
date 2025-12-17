package com.example.demo.entity;

import jakarata.persistence.Entity;
import jakarata.persistence.GeneratedValue;
import jakarata.persistence.GenerationType;
import jakarata.persistence.Id;

@Entity
public class stuentity{
    @Id
    @GeneratedValue(stragy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}