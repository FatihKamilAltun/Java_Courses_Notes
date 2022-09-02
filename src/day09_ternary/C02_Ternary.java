package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {
        /*
        Soru4 ) Kullanicidan bir sayi alin.
        Sayi pozitifse “Sayi pozitif” yazdirin,
        negatifse  sayinin karesini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi girininz");
        double sayi=scan.nextDouble();

        //eger ternary icindeki sonuclar farkli data turleinde ise
        // atama yapamayiz, sadece yazdirabiliriz
        // double sonuc = sayi>0 ? "Sayi pozitif" : (sayi+sayi)

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));

    }
}
