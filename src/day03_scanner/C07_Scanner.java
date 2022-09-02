package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {
        //bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız//

        Scanner scan=new Scanner (System.in);

        System.out.println("Lütfen adınızı,soyadınızı ve yaşınızı giriniz \naralarda Enter tuşuna basınız");

        String ad=scan.next();
        String soy=scan.next();
        int yas=scan.nextInt();



        System.out.println("Girilen bilgiler : " +ad + " "+soy +" "+ yas);





    }
}
