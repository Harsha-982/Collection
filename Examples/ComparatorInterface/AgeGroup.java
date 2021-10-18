package src.main.java.Examples.ComparatorInterface;

import java.util.Collections;
import java.util.Comparator;

public class AgeGroup {
    private int age;
    private String name;
    public AgeGroup(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "AgeGroup { name : "+this.getName()+" age : "+this.getAge()+" }";
    }
}
