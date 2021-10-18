package src.main.java.List.arrayList;

import java.util.ArrayList;

public class trimToSizeVsEnsureCapcity {
    public static void main(String[] args) {
        ArrayList initial = new ArrayList();
        //intital capacity 10
        initial.add(10);
        initial.add(20);

        //increase the size
        initial.ensureCapacity(20); //now it can hold minimum of 20

        //decrease the size to usage
        initial.trimToSize();

    }
}
