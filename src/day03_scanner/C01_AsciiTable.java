package day03_scanner;

public class C01_AsciiTable {

    public static void main(String[] args) {


        int sayi=10;
        char harf1='a';
        String str="banan";



        System.out.println(sayi+harf1);
        System.out.println(str+harf1);

        System.out.println(sayi*harf1);

        //char yeniHarf=harf1+2;
        /*
        1- char data türü işleme girdiği değişkenin türüne göre
        farklı davranabilir. Eğer matematiksel variable sayısal bir değer ise sayı gibi davranır.
            sayi*harf sayı variablesi int olduğundan harf variablesi ascii tablosundaki değeri kullanır

            char yeniHarf=harf1+2; java önce sağdaki işlemi yapar, sağda int + char görünce ascii değerini alır
            ve sonucu 99 bulur.

            Sonra atama işlemi yapmaya çalışır,
            char yeniHarf=99 kodunda sağ taraf sol tarafa yani integer sol taraf character olduğu için uyuşmadığı için kabul etmez

         2- String variable çok güçlüdür. hangi data türü ile işleme girerse girsin diğer data türünü kendine benzetir.

         */
        //3- konsolda verilen veriableleri kullanarak 10a görmek istersek nasıl yazdırmalıyız//

        System.out.println(""+sayi+harf1);





    }
}
