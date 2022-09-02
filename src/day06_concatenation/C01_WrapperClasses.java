package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        /*
        Wrapper class javanın hazir methodlari kullanabilmeniz icin
        primitive data turlerinin herbiri icin actigi classtir
         */


        String str="Java ile hayat ne guzel";


        System.out.println(str.toUpperCase());

        boolean guzelMi=true;
        // boolean primitive olduğundan hazır methodu bulunmuyor

        Boolean buGuzelMi=true;


        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE); // min değeri gösterir
        System.out.println(Short.MAX_VALUE); // max degeri gosterir

        String ogrenciNo="123456";

        //kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen  basamaklı bir şifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen şifrenin 3 fazlasi : " + (sifre+3));
        System.out.println("Integer şifrenin 3 fazlasi : "+ (sifreSayi+3));

        /*
        Wrapper classlar ileride kullanabilecegimiz pekcok faydali hazir method içerir
         */


    }
}
