package src.main.java.List.arrayList;

import java.util.Comparator;

public class myclass implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;

        return i1.compareTo(i2);
    }
    public int compare(String s1,String s2){
        return s1.compareTo(s2);
    }
}
