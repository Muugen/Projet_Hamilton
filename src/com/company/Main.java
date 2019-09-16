package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 23;
        float taille = 1.80f;
        float height = 5.90551f;
        String firstname = "Anthony";
        String lastname = "HUYNH";
        boolean dunno = true;

        System.out.println(age);
        System.out.println(height + " ou " + taille);
        System.out.println(lastname);
        System.out.println(firstname);
        System.out.println(dunno);

        age = age + 2;

        System.out.println("mon age apres la coding " + age);

        float pastyear = (int) (age / 2);

        System.out.println("mon age quand j'ai eu mon pc " + pastyear);

        float futuryear = (int) (age * 1.5);

        System.out.println("mon age quand il y'aura une colonie sur mars " + futuryear);

        float rest = age % 2;

        System.out.println(rest);


        int A;
        int B;

        A = 23;
        B = 25;

        if (A >= B){
            System.out.println("not a dev yet");
        }

        else {
            System.out.println( "you're a dev now !!");
        }

        int A;
        int B;
        int C;

        A = 50;
        B = 100;
        C
    }
}