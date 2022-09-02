package day07_ifStatements;

import java.util.Scanner;

public class C04_BasicIfStatements {
    public static void main(String[] args) {

         /*
    Kullanıcidan gun ismini alin ve haftaici veya haftasonu yazdirin

    örnek:          gun=pazar = "haftasonu"
                    gun=sali = "haftaici"

    *** String icin equal methodu kullanin


     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String girilenGun=scan.next().toLowerCase();
        // kullanici Pazar, pazar, PAZAR, PaZar ??? bilemeyiz
        // lowercase kullanırsak pazar, pazaar, pazar, pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen gün HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı") ||
        girilenGun.equals("çarsamba") || girilenGun.equals("perşembe") || girilenGun.equals("cuma")) {
            System.out.println("Girilen gün HAFTAİCİ");
        }

        if(!(girilenGun.equals("pazartesi") || girilenGun.equals("salı") ||
                 girilenGun.equals("çarsamba") || girilenGun.equals("perşembe") || girilenGun.equals("cuma")
        || girilenGun.equals("pazar") || girilenGun.equals("cumartesi"))) {
            System.out.println("Lütfen bir gün ismi giriniz");
        }


    }




}
