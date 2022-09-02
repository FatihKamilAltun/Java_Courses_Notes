package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        Kullanıcıdan iki sayı alıp
        bu sayıların çarpımını yazdırın
         */

        //1.Adım
        Scanner scan= new Scanner(System.in);

        //2.Adım
        System.out.println("Lütfen ilk sayıyı giriniz");

        //3.Adım
        double sayi1=scan.nextDouble();

        //2.sayı için 2 ve 3. adımları tekrarlarız

        System.out.println("Lütfen ikinci sayıyı giriniz");

        double sayi2=scan.nextDouble();

        System.out.println("Sayıların çarpımı : " + sayi1*sayi2);




    }
}