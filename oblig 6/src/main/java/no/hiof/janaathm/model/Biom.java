package no.hiof.janaathm.model;

import java.util.ArrayList;

public class Biom extends Location {
    protected ArrayList<String> bioms = new ArrayList<>();

    public Biom() {}
    public Biom(ArrayList<String> bioms) {
        this.bioms = bioms;
    }

    public ArrayList<String> getBioms() {
        return bioms;
    }

    public void setBioms(ArrayList<String> bioms) {
        this.bioms = bioms;
    }
}
