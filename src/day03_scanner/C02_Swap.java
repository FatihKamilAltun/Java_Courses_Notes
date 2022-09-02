package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {


        int sayi1=10;
        int sayi2=20;

        int degisken=0;

        System.out.println("swap'tan önce sayi1 : " + sayi1);
        System.out.println("swap'tan önce sayi2 : " + sayi2);
        degisken=sayi2;
        sayi2=sayi1;
        sayi1=degisken;

        System.out.println("swap'tan sonra sayi1 : " + sayi1);
        System.out.println("swap'tan sonra sayi2 : " +sayi2);

    }
}
