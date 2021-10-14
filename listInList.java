package src.main.java.List.arrayList;

import java.util.ArrayList;

public class listInList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        list.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        list.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        list.add(a3);
        //Access inside
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(0).indexOf(1));

    }
}
