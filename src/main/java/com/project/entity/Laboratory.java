package com.project.entity;

import javax.persistence.*;

/*
    实验室
 */
@Entity
@Table(name = "laboratory")
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;//实验室ID
    private String name;//实验室名称
    private String info;//实验室简介

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
