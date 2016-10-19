package com.example.iem.tpvolkswagen;

import android.media.Image;

import java.util.Date;

/**
 * Created by iem on 19/10/2016.
 */

public class Marque extends Groupe {
    Integer id;
    String name;
    Integer ca2015;
    String origine;
    Integer effective;
    Date acquisitionDate;


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCa2015() {
        return ca2015;
    }

    public void setCa2015(Integer ca2015) {
        this.ca2015 = ca2015;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }


}
