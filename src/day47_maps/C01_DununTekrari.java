package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        // Ogrenci listesini isim soyisim olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // kac farkli brans varsa bransIsmi: branstakiOgrenciSayisi şeklinde yazdirin
        ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);
    }
}
