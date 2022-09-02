package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farkli bir class'ta calisirken
        her hangi bir class adini yazip .'ya basarsak
        adini yazdigimiz class'taki tum STATİC class uyelerini gorebilir
        ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod();  // 10
        System.out.println(C02_StaticVariables.staticSayi);  // 10
        System.out.println(C02_StaticVariables.degersizStaticVar);  // 0
        /*
         Class level variable'lara deger atayip atamamak bize kalmistir
         istersek deger atamasi yapariz istemezsek deger atamayiz
         Eger deger atamissak Java atadigimiz o degeri kabul eder
         deger atamazsak Java bu variable'lara default bir deger atamasi yapar

         default deger nedir?;
         int     --> 0
         String  --> null
         boolean --> false
         char    --> '' (char olarak hiclik)
         */

        /*
        baska Class'daki instance variable'lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVariable); // 0

        System.out.println(C02_StaticVariables.staticSayi); // 20

        /*
        farkli bir class'tan C02 Class'indan method ve variable'lari
        kullandigimda C02 Class'inin tamami degil sadece benim cagirdigim kisim class uyeleri calisir
         */



    }
}
