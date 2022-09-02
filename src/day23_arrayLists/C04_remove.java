package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");




        /*
        remove methodu 2 şekilde kullanılır

        1- objeyi yazip silmesini istersek bize boolean sonuc doner. true/false
        2- index girersek o indexteki elemani siler ve bize silinen eleami dondurur.

         */

        System.out.println(urunler);  // [Nutella, Ikram, Cekirdek, Cay]

        System.out.println(urunler.remove("Ikram")); // true
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby")); // false
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]



        // kinci yontemi deneyelim yani index girelim

        System.out.println(urunler.remove(1)); // Cekirdek
        System.out.println(urunler); // [Nutella, Cay]

        // olmayan bir indexi silmeye calisalim

        // System.out.println(urunler.remove(5)); ---> IndexOutOfBoundsException
    }
}
