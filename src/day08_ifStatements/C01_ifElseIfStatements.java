package day08_ifStatements;

import java.util.Scanner;

public class C01_ifElseIfStatements {

    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün yazınız");
        String day=scan.next().toLowerCase();

        if (day.equals("pazartesi")){
            System.out.println("Paz");

        } else if(day.equals("salı")){
            System.out.println("Sal");
        } else if(day.equals("çarşamba")){
            System.out.println("Çar");
        } else if(day.equals("perşembe")){
            System.out.println("Per");
        } else if(day.equals("cuma")){
            System.out.println("Cum");
        } else if(day.equals("cumartesi")){
            System.out.println("Cum");
        } else if(day.equals("pazar")){
            System.out.println("Paz");
        } else {
            System.out.println("Lütfen geçerli bir gün giriniz");
        }

    }
}
