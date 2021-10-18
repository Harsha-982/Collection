package src.main.java.Examples.ComparableSort;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSorting {
    public static void main(String[] args){
        ArrayList<PartyList> partyLists=new ArrayList<>();
        partyLists.add(new PartyList(1,"harsha"));
        partyLists.add(new PartyList(2,"usha"));
        partyLists.add(new PartyList(3,"reshma"));

        Collections.sort(partyLists);
        for(PartyList list:partyLists){
            System.out.println(list.getName()+" "+list.getNumber());
        }
    }
}
