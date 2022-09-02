package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]

        // listedeki tum elementleri INDEX KULLANMADAN 3 artirin
        for (Integer each : liste
        ) {
            each += 3;
            System.out.print(each + 3 + " "); // 13 23 33
        }
        System.out.println();
        System.out.println(liste); // atama yapilmadigi icin [10, 20, 30]
        /*
        Java index yapisi olmayan Collection'lardaki
        elementlere ulasmak veya degistirmek icin
        Iterator interface'ini olusturmustur.

        iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator döndürenliste.iterator method'unu kullaniyoruz
         */

        System.out.println(liste); // [10, 20, 30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
        // System.out.println(it1.next()); // NoSuchElementException 30'dan sonra element kalmadigindan next() RTE verir


        // Iteratorde geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir

        Iterator it2 = liste.iterator();
        // yeni it22yi kullanarak listenin tum elementlerini silelim

        it2.next();
        it2.remove();
        System.out.println(liste); // [20, 30]  iterator 10'un uzerinden gecerek sildi

        it2.next();
        it2.remove();
        System.out.println(liste); // [30] iterator 20'nin uzerinden gecerek sildi

        it2.next();
        it2.remove();
        System.out.println(liste); // []

        /*
        iterator ile elementleri gezip, remove yapinca
        liste kalici olarak degisti
         */

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : " +liste); // [10, 20, 30] listeyi yeniden doldurduk
        Iterator it3 = liste.iterator();


        while (it3.hasNext()) {
            it3.next();
            it3.remove();

        }
        System.out.println("loop'dan sonra liste : " + liste);

        /*
        Goruldugu gibi iterator kullanarak yapabildigim
        1- tum collection elementlerini yazdirmak
        2- tum collection elementleri silmek
        Bu da bize yetmez
         */


    }
}
