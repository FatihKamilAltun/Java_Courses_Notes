package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayaElemanEkleme {
    public static void main(String[] args) {

        // C05'teki methodu kullanarak arraye eleman ekleyeleim


        String [] takimListesi={"Süleyman","Osman"};
        String eklenecekIsim="Talha";

        takimListesi= C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));


    }



}
