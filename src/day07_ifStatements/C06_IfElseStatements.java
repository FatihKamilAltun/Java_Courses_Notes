package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {

    public static void main(String[] args) {

        /*
            Kullaniciya yesini sorun, eger yas 65'ten kucukse "emekli olamazsin, calismalisin",
            65'e esit veya buyukse "emekli olabilirsin" yazdırın
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65) {
            System.out.println("Emekli olamazsiniz, " +(65-yas) +" yil daha calismalisiniz");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }


}
