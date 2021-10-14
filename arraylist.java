package src.main.java.List.arrayList;

import java.util.ArrayList;

import java.util.Collections;


public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(),b = new ArrayList();
        a.add(0); // void add
        a.add(6);
        a.add(3);
        System.out.println(a);// 0 1 3
        a.replaceAll(e->e*e);
        System.out.println(a); //0 1 9
        b.add(1);
        b.add(4);
        System.out.println(b.retainAll(a));//true
        Collections.sort(a,new myclass());
        System.out.println(a);
    }
}