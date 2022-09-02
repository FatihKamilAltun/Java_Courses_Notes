package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="Java cok guzel";
        str.toUpperCase();

        int sayi=10;
        //primitive data turlerinin yaninda methodlar olmaz
        //Java bazi methodlari kullanabilmemiz icin
        // herbir primitive data turu icin bir wrapperclass olusturmustur

        Integer sayi2=10;

        sayi2.byteValue();

        //wrapper sarmalayıcı demek
        //primitive data turlerini non-primitive şeklinde dönüştürerek methodlar oluşturulmasına izin verir
        //ve bunların non-primitiveler ile karışmaması için özel bir isim vermiştir. özel isim:wrapperclass

    }
}
