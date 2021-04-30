package org.example;

import java.util.ArrayList;

class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }
}


public class ProgramGen {

    public static void main(String[] args) {

        TwoTuple<Integer, String> twoTuple = new TwoTuple<>(1, "f");
        System.out.println(twoTuple.first.getClass().getName()); // java.lang.Integer
        System.out.println(twoTuple.first); // 1
        System.out.println(twoTuple.second.getClass().getName()); // java.lang.String
        System.out.println(twoTuple.second); // f

        ArrayList listObj = new ArrayList();
        listObj.add("A");
        listObj.add(111);
        String value1 = (String) listObj.get(0); // cast
//        String value2 = (String) listObj.get(1); // cast // error (cannot cast Integer to String)
        Integer value3 = (Integer) listObj.get(1); // cast

        System.out.println(value1); // A
        System.out.println(value3); // 111

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("A");
//        listStr.add(111); // error
        String str11 = listStr.get(0); // no cast
//        String str12 = listStr.get(1); // no cast
    }
}
