package day12_stringManipulations;

public class C03_substring {

    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3)); // index 3'ü bulacak ve sona kadar gidecek yani : eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // f ve sonrasi yani : fil
        System.out.println(isim.substring(2,4));// le kaldi. 2. indexten basladi 4. indexe kadar 4. index dahil degil

        // isim ve soyisim ilk harf buyuk harf geriye kalan *
        // kredi kartının ilk 4 harfi gorunsun geriye kalan *

        String isimİlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimİlkHarf+isimGeriyeKalanlar+" "+soyisimIlkHarf+soyisimGeriyeKalanlar+"\n"+kkIlk4+kkGeriyeKalanlar);
    }
}
