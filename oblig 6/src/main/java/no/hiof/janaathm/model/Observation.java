package no.hiof.janaathm.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Observation {
    protected String id, name, pictureURL, comment;
    protected double quantity;
    protected Animal animal;
    protected Location location;
    protected Date date;
    public Observation() {}
    public Observation(String id, String name, Animal animal, Location location, Date date, double quantity, String pictureURL, String comment) {
        this.id = id;
        this.name = name;
        this.animal = animal;
        this.location = location;
        this.date = date;
        this.quantity = quantity;
        this.pictureURL = pictureURL;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Observation[" + "id: " + getId() + ", name: " + getName() + ", pictureURL: " + getPictureURL() + ", comment: " + getComment() +
                ", quantity: " + getQuantity() + ", animal: " + getAnimal() + ", location: " + getLocation() + ", date: " + getDate() + ']';
    }
}
