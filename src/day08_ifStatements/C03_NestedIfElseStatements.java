package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElseStatements {

    public static void main(String[] args) {
        /*
        emeklilik kontrolu yapan bir program yaziniz
        cinsiyet olarak e (erkek) veya k (kadın) değişkenlerini kabul etsin
        farkli bir sembol veya harf girilirse hata mesaji versin

        emeklilik icin yas siniri kadinlarda 60 ve erkeklerde 65 olsun

        negative yas veya 80'den buyuk yas girilirse hata mesaji versin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yaziniz"+
                "\n Kadin icin K Erkek icin E harfini giriniz");
        char cinsiyet =scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='E'){
            if(yas<0 || yas>80){
                System.out.println("Gecerli bir yas giriniz");
            } else if(yas<65){
                System.out.println("Emekli olamazsin" + (65-yas) + " daha calismaniz lazim");
            } else{
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet=='K'){
            if(yas<0 || yas>80){
                System.out.println("Gecerli bir yas giriniz");
            } else if(yas<60){
                System.out.println("Emekli olamazsin" + (60-yas) + " daha calismaniz lazim");
            } else{
                System.out.println("Emekli olabilirsiniz");

            }


        } else {
            System.out.println("Lütfen gecerli bir tercih giriniz");
        }


    }
}
