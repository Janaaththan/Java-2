package no.hiof.janaathm.model;

public class Virveldyr extends Animal {
    protected double weight;

    public Virveldyr() {}
    public Virveldyr(String nName, String sName, double age, double weight) {
        super(nName, sName, age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Virveldyr[" + "NormalName: " + getnName() +  ", ScientificName: " + getsName() + ", age: " + getAge() + ']';
    }
}
