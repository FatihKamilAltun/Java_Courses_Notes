package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {



    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir Array'de tuttugumuzu varsayalim
        Kullaniciya index sorup, o indexteki urunu yazdiran bir program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse
        exception vermesinin onune gecelim
         */

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira no'sunu giriniz");

        int istenenSira=0;



             try {
                 istenenSira = scan.nextInt();
             } catch (InputMismatchException deneme) {
                 System.out.println("urun sirasi icin bir tam sayi girmeniz gerekli");
             }




        /*
        catch blokunun onundeki parantezde
        exceptions classinin ismi ve yaninda
        yakalanan exception'i atadigimiz variable'in ismi olur (e)

        eger yakalanan exception ile ilgili bilgileri
        kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz
        eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
        (e) kullanilmasa da kod calisir
        */
        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla " + urunler.length +
                    " olabilir");
            ;
        }
    }
}

/*
kullanici dogru sayiyi girene kadar loop'a sokun
while ile
 */
