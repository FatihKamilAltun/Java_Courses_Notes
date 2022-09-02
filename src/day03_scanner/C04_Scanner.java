package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin
        //girilen ismi
        //isminiz: Kamil şeklinde yazdırın

        //insanların dünyasından kodlarımızın bulunduğu class'a değer almak için
        //Scanner class'ını kullanırız

        //1- Scanner objesi oluşturalım
        Scanner scan =new Scanner(System.in);

        //2-kullanıcıya ne istediğimizi söyleyelim
        System.out.println("Lütfen isminizi giriniz");

        //3- Oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        //    oluşturacağımız uygun bir variable'a atayalım

        String kullaniciIsmi=scan.next();


        System.out.println("girilen isim : "+kullaniciIsmi);


    }
}
