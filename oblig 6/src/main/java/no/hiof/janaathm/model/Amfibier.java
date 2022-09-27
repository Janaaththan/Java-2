package no.hiof.janaathm.model;

public class Amfibier extends Animal {

    protected Boolean legs;

    public Amfibier() {}
    public Amfibier(String nName, String sName, double age, boolean legs) {
        super(nName, sName, age);
        this.legs = legs;
    }

    public Boolean getLegs() {
        return legs;
    }

    public void setLegs(Boolean legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Amfibier[" + "NormalName: " + getnName() +  ", ScientificName: " + getsName() + ", age: " + getAge() + ", legs: " + getLegs() + ']';
    }
}
