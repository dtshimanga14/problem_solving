package org.example;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {
        System.out.println("hello world");
    }
    public static Singleton getInstance(){
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }
}
