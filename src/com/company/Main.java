package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A;
        int B;

        A = 23;
        B = 25;

        if (A >= B) {
            System.out.println("not a dev yet");
        } else {
            System.out.println("you're a dev now !!");
        }

//        float D = 0.2f;
//        float CD = 0.5f;
//        String safe = "you can drive";
//        String molo = "go on easy bruh";
//        String yolo = " you only live once but prepare yourself to die MTF";
//        Scanner sc = new Scanner(System.in);
//        float TA = sc.nextFloat();
//
//
//        if ( TA < D ){
//           System.out.println(safe);
//        }
//        else {
//            if ( TA > D && TA < CD )
//            System.out.println(molo);
//            else {
//                System.out.println(yolo);
//            }
//        }

        int MI = 23;
        int MJ = 18;

        if (MI >= MJ) {
            System.out.println("tu es majeure, tu peut boire !!");
        } else {
            if (MI < MJ)
                System.out.println("tu es mineure, tu ne peux pas boire !!");
            else {
                System.out.println("erreur!!");
            }
        }

        //-----------------------------note bac----------------------

        int n = 10;

        String sp = "Sa passe !";
        String asb = "Assez bien !";
        String bi = "Bien !";
        String trb = "Trés bien !";
        String exl = "Exellent !!";
        String rt = "Rattrapage :/";

        if (n >= 10 && n < 11) {
            System.out.println(sp);
        } else {
            if (n >= 12 && n < 14) {
                System.out.println(asb);
            } else {
                if (n >= 14 && n < 16) {
                    System.out.println(bi);
                } else {
                    if (n >= 16 && n < 18) {
                        System.out.println(trb);
                    } else {
                        if (n >= 18 && n <= 20) {
                            System.out.println(exl);
                        } else {
                            if (n<=9 && n == 7){
                                System.out.println(rt);
                            } else {
                                if (n>=0 && n<=6){
                                    System.out.println("C'est raté :(");
                                } else{
                                    System.out.println("hey you MTF you cheated !!");
                                }
                            }
                        }
                    }
                }
            }
        }

        //---------------------uti modulo x valeur paire ou impaire------------------

        int v=2;

        String p="valeur paire";
        String ip="valeur impaire";

        if(v % 2 == 0){
            System.out.println(p);
        }
        else{
            System.out.println(ip);
        }

        //-------------------------année bissextile----------------------

        int jours=28;
        int mois=12;
        int annee=2000;

        String ab=(jours +"/"+ mois +"/"+ annee + " est bissextile");
        String anb=(jours +"/"+ mois +"/"+ annee + " est bissextile");

        if (mois >= 1 && mois <=12){
            if ((mois %2 ==1 || mois==8) && jours >=1 && jours <=31) {
                if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
                    System.out.println(ab);
                } }
            else if (mois % 2 == 0 && mois != 2 && jours >= 1 && jours <= 30) {
                    if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
                        System.out.println(ab);
                    } else if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
                        if (mois == 2 && jours == 29) {
                            System.out.println(ab);
                        }
                    } else {
                        System.out.println(anb);
                    }
                }



        }


    }
}
