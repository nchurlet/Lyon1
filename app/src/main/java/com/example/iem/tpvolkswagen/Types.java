package com.example.iem.tpvolkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Types extends Marque {
    Integer id;
    String name;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
