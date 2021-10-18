package src.main.java.Set.hashset;

import java.util.Collections;
import java.util.HashSet;


public class AddElements {
    public static void main(String[] args){
        HashSet<String> set=new HashSet();
        HashSet<String> newSet=new HashSet();
        //add elements
        set.add("Harsha");
        Collections.addAll(set,"Usha","Anil","Munni","Anil"); //removes duplicate
        System.out.println("Orginial set"+set);

        Collections.addAll(newSet,"Anil","Munni","Bhavya","Padma");
        set.remove("Anil");
        System.out.println("Set after removing and object"+set);

        //removeAll condition
        set.removeAll(newSet);
        System.out.println("After removing a collection"+set);

        //removeIf condition
        set.removeIf(s->s.contains("Harsha"));
        System.out.println(set);

        //to remove all elements of a list at a time
        set.clear();
        System.out.println(set);
    }
}
