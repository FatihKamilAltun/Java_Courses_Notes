package day11_stringManupilations;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin,
        cumle "buyuk" kelimesini iceriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesini iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk ya da buyuk kelimesi icermiyor" yazdirin
         */

        String cumle="Java buyulu, dunya kucuk";
        cumle=cumle.toLowerCase();
        // requirementste buyuk veya kucuk harf hassasiyeti hakkında bir sey söylenmemis
        // ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        // ek requiments : ikisini de iceriyorsa "karar ver buyuk mu yazdirayim kucuk mu yazdirsin"
        // case sensitive olmasin


        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu yazdirayim kucuk mu");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("cumle buyuk ya da kucuk kelimesi icermiyor");
        }

    }
}
