package day08_ifStatements;

import java.util.Scanner;

public class C02_ifElseIfStatements {
    public static void main(String[] args) {
        /*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”, 50-60 arasi “C”,
        60-80 arasi “B”, 80’nin uzerinde ise “A”
        gecersiz not girildiginde uyari verelim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double note=scan.nextDouble();

        if (note<0 || note>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if(note<50){    // bu satıra geldiysek notumuz sifir ile yuz arasindadir
            System.out.println("Notunuz : D");
        } else if (note<60) {// bu satira geldiysek notumuz 50 ile 100 arasindadir
            System.out.println("Notunuz : C");
        } else if (note<80){ // bu satira geldiysek notumuz 60 ile 100 arasindadir
            System.out.println("Notunuz : B");
        } else {
            System.out.println("Notunuz : A");}

    }
}
