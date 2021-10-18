package src.main.java.Set.Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
//        HashSet<ArrayList> set =new HashSet<ArrayList>();
//        ArrayList sublist;
//        for(int i=0;i<t;i++){
//            sublist =new ArrayList();
//            sublist.add(pair_left[i]);
//            sublist.add(pair_right[i]);
//            set.add(sublist);
//            System.out.println(set.size());
//        }
        HashSet set= new HashSet();
        for(int i=0;i<t;i++){
            set.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(set.size());
        }
    }
}

