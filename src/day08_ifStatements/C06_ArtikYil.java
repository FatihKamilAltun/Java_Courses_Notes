package day08_ifStatements;

import java.util.Scanner;

public class C06_ArtikYil {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir yıl girmesini isteyin
        girilen yıl artik yılsa
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("Lüfen bir yil giriniz");
        int yil=scan.nextInt();

        if (yil%4!=0){
            System.out.println("Artik yil degil");
        } else if (yil%100!=0){
            System.out.println("Artik yil");
        } else if (yil%400!=0){
            System.out.println("Artik yil degil");
        }else {
            System.out.println("Artik yil");
        }
    }
}
