package com.example.iem.tpvolkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Model {
    Integer id;
    String name;
    Integer nbWheels;
    Float weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNbWheels() {
        return nbWheels;
    }

    public void setNbWheels(Integer nbWheels) {
        this.nbWheels = nbWheels;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
