package no.hiof.janaathm.model;


import org.jetbrains.annotations.NotNull;

public class Location implements Comparable<Location> {
    protected String name;
    protected double longitude,latitude;
    protected Biom biom;
    protected Planet planet;

    public Location() {}
    public Location(String name, double longitude, double latitude, Planet planet, Biom biom) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.planet = planet;
        this.biom = biom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Biom getBiom() {
        return biom;
    }

    public void setBiom(Biom biom) {
        this.biom = biom;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public String toString() {
        return "Location[name: " + getName() + ", longitude: " + getLongitude() + ", latitude: " + getLatitude() + ", planet: " + getPlanet() + ", biom: " + getBiom() + ']';
    }

    @Override
    public int compareTo(@NotNull Location o) {
        double latitude = ((Location) o).getLatitude();
        return (int) (latitude - getLatitude());
    }
}
