package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminizi yazınız");
        /*
        String verileri scanner ile alırken
        next() : ilk boşluğa kadar olan kısmı (1 kelime) alır
        nextLine() : satırın sonuna kadar ne yazarsak alır
        NOT: eğer ardarda birden fazla String değer alacaksak nextLine() kullanmalıyız
         */

        String name=scan.nextLine();

        System.out.println("Lütfen soyisminizi yazınız");

        String surName=scan.nextLine();

        System.out.println("Lütfen yaşınızı yazınız");

        double yas=scan.nextDouble();

        System.out.println("İsminiz-Soyisminiz ve Yaşınız: " + name+" "+surName+" "+ yas);





    }
}
