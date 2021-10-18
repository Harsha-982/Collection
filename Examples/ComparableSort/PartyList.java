package src.main.java.Examples.ComparableSort;

public class PartyList implements Comparable<PartyList>{

    private int number;
    private String name;
    public PartyList(int number,String name){
        this.number=number;
        this.name=name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(PartyList o) {
        return name.compareTo(o.name);
    }

}
