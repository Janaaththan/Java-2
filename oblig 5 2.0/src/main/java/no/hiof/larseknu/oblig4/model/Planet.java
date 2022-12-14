package no.hiof.larseknu.oblig4.model;

public class Planet extends NaturalSatellite {
    public static final double KG_IN_MJUP = 1.898E27;
    public static final double KM_IN_RJUP = 71492;
    public static final double KG_IN_MEARTH = 5.972E24;
    public static final double KM_IN_REARTH = 6371;

    public static final double GRAVITATIONAL_CONSTANT = 6.67408E-11;

    public Planet(String name, double mass, double radius, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, mass, radius, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    public Planet(String name, double mass, double radius, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody, String pictureUrl) {
        super(name, mass, radius, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody, pictureUrl);
    }


    public double getSurfaceGravity() {
        // g = GM / R^2
        return (GRAVITATIONAL_CONSTANT * getMass()) / Math.pow(getRadiusInMeter(), 2);
    }

    public double getMassInMjup() {
        return getMass() / KG_IN_MJUP;
    }

    public double getRadiusInRjup() {
        return getMass() / KM_IN_RJUP;
    }

    public double getMassInMearth() {
        return getMass() / KG_IN_MEARTH;
    }

    public double getRadiusInRearth() {
        return getRadius() / KM_IN_REARTH;
    }

    private double getRadiusInMeter() {
        return getRadius() * 1000;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %.2fkm and a mass of %.2fkg", getName(), getRadius(), getMass());
    }
}
