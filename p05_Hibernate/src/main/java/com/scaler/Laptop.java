

// ------------------------------------- ONE TO MANY AND MANY TO ONE ------------------------------------- //

/*
package com.scaler;

import jakarta.persistence.*;

@Entity
public class Laptop {

    @Id
    private int lid;
    private String Brand;
    private String Model;
    private int ram;
    @ManyToOne
    private Alien alien;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
*/





// ------------------------------------- MANY TO MANY ------------------------------------- //



package com.scaler;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private int lid;
    private String Brand;
    private String Model;
    private int ram;
    @ManyToMany(mappedBy = "laptops")
    private List<Alien> alien;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public List<Alien> getAlien() {
        return alien;
    }

    public void setAlien(List<Alien> alien) {
        this.alien = alien;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", ram=" + ram +
                ", alien=" + alien +
                '}';
    }
}