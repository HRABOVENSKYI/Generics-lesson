package org.example;

public class GenMethod {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenMethod gm = new GenMethod();
        gm.<String>f(""); // java.lang.String
//        gm.<Integer>f(""); // error
        gm.f(1); // java.lang.Integer
        gm.f(1.0); // java.lang.Double
        gm.f(1.0F); // java.lang.Float
        gm.f('c'); // java.lang.Character
        gm.f(gm); // org.example.GenMethod
    }

}
