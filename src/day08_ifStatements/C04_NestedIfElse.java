package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        // sayinin 5'e bolunup bolunememesi
        // sayinin son basamaginin sifir olup olmamasi

        if (sayi<1000 || sayi>9999){
            System.out.println("Lütfen 4 basamakli bir sayi giriniz");
        } else if (sayi%5==0) {    // sayi 4 basmakli ve 5'e tam bolunebiliyor
            if (sayi%10==0){
                System.out.println("Girilen sayi 5'e bolunen cift sayidir");
            } else {
                System.out.println("Girilen sayi 5'e bolunen tek sayidir");
            }

        } else {
            System.out.println("Tekrar deneyin");

        }
    }
}
