package day10_stringManupilation;

public class C05_length {

    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length());  //str'nin karakter sayisini döndürür

        System.out.println(str.charAt(str.length()-1)); // son karakteri yazdirir p

        System.out.println(str.charAt(str.length()-3));//sondan 3. karakteri yazdiralim

        /*
        Java'da "null pointer" (isaretleyici) bir degere değil,
        karsisina yazildigi variable'ın hic bir deger almadiginin isaretcisidir
         */

        String str2=""; // str2'ye bir deger atanmis midir cevap : evet
                        // bu deger nedir cevap : hiclik
        System.out.println(str2.length()); // eger bir deger varsa bunun yazdirmasi lazim

        String str3=null; // str3'e bir deger atanmis midir cevap: hayir
                          // null bu deger atamamayi isaret etmektedir
        System.out.println(str3.length()); // bir deger atamamissin ki uzunlugu olsun
                                           // NullPointerException olarak hata verir

    }


}
