package no.hiof.janaathm.model;

public class Planet extends Location{
    protected String name;

    public Planet() {}
    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
