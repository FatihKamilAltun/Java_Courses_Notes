package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Rakamlar_Toplami {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı pozitif bir tam sayı giriniz");

        int sayi=scan.nextInt(); // kullanıcı 5267 girsin

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        //şu anda sayımız 5267 birler basamağı 0, rakamlar toplamı 0

        birlerBasamagi=sayi%10; //birler basamağı 7
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        //şu anda sayımız 526 oldu, birlerBasamagi 7, rakamlarToplamı 7

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        //şu anda sayı 52, birlerBasamagi 6 rakamlarToplamı 13

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        //şu anda sayı 5, birlerBasamagı 2 rakamlarToplamı 15

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        //şu anda sayı 0, birlerBasamagi 5 rakamlarToplamı 20

        System.out.println(ilkGirilenSayi + " sayısının rakamları toplamı : " + rakamlarToplami);





    }
}
