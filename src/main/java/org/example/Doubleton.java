package org.example;

public class Doubleton {
    private static int counter;
    private static Doubleton even;
    private static Doubleton odd;

    private Doubleton() {

    }
    public static Doubleton getInstance(){
        if(counter % 2 == 0){
            if(even == null){
                even = new Doubleton();
            }
            System.out.println("odd singleton");
            counter++;
            return even;
        } else {
            if(odd == null){
                odd = new Doubleton();
            }
            System.out.println("even singleton");
            counter++;
            return odd;
        }
    }
}
