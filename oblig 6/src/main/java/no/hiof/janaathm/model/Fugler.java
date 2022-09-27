package no.hiof.janaathm.model;

public class Fugler extends Animal {
    protected boolean fly;

    public Fugler() {}
    public Fugler(String nName, String sName, double age, boolean fly) {
        super(nName, sName, age);
        this.fly = fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Fugler[" + "NormalName: " + getnName() +  ", ScientificName: " + getsName() + ", age: " + getAge() + "Flyable: " + isFly() + ']';
    }
}
