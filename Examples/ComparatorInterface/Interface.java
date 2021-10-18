package src.main.java.Examples.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Interface {
    public static void main(String[] args) {
        ArrayList<AgeGroup> ageGroups = new ArrayList<AgeGroup>();
        ageGroups.add(new AgeGroup(21, "harsha"));
        ageGroups.add(new AgeGroup(23 ,"usha"));
        ageGroups.add(new AgeGroup(50,"subbarao"));
        ageGroups.add(new AgeGroup(45,"padma"));

        Comparator<AgeGroup> nameSort = new Comparator<AgeGroup>() {
            @Override
            public int compare(AgeGroup o1, AgeGroup o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<AgeGroup> ageSort=new Comparator<AgeGroup>() {
            @Override
            public int compare(AgeGroup o1, AgeGroup o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        Collections.sort(ageGroups, ageSort.reversed());
        for(AgeGroup ageGroup:ageGroups){
            System.out.println(ageGroup);

        }
    }

}
