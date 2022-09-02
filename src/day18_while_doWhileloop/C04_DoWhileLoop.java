package day18_while_doWhileloop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan tam sayilar alin
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        // while ile yapalim
        // loop'larda kullanacagimiz variable'lari loop'tan once olusturmaliyiz
        // while loop'ta, loop'tan once olusturdugumuz bu variable'a
        // atayacagimiz degeri iyi dusunmemiz gerekir
        while (sayi%2==0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+ sayi);
            } else{
                System.out.println("Girilen sayi tek oldugu icin gorusuruz :)");
            }
        }

        // do while ile yapalim
        // do while loop'ta onceden olusturulan variable'a hangi deger atandiginin
        // hicbir onemi yok, kodumuz her durumda calisir

        /*
        do while'nin dezavantaji:
        ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinden yanlis bir islem yapilmamasina dikkat etmek gerekir
         */


        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+ sayi);
            } else{
                System.out.println("Girilen sayi tek oldugu icin gorusuruz :)");
            }

        }while (sayi%2==0);
    }
}
