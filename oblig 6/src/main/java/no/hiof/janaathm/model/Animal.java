package no.hiof.janaathm.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.jetbrains.annotations.NotNull;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Amfibier.class, name = "Amfibier"),
        @JsonSubTypes.Type(value = Fugler.class, name = "Fugler"),
        @JsonSubTypes.Type(value = Virveldyr.class, name = "Virveldyr")
})

public abstract class Animal implements Comparable<Animal>{
    protected String nName, sName;
    protected double age;


    public Animal() {}
    public Animal(String nName, String sName, double age){
        this.nName = nName;
        this.sName = sName;
        this.age = age;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal[" + "NormalName: " + getnName() +  ", ScientificName: " + getsName() + ", age: " + getAge() + ']';
    }

    @Override
    public int compareTo(@NotNull Animal o) {
        double age = ((Animal) o).getAge();
        return (int) (age - getAge());
    }
}
