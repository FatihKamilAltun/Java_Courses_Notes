package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {

    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("HPolat");
        ll3.add("Kadir");
        // Queue kuyruk demektir, sira onemlidir
        // gelen sona gelir, giden bastan gider

        System.out.println(ll3); // [Adem, Zeynep, HPolat, Kadir]

        System.out.println(ll3.remove()); // Adem
        System.out.println(ll3); // [Zeynep, HPolat, Kadir]  bastaki gitti

        System.out.println(ll3.remove("HPolat")); // true
        System.out.println(ll3); // [Zeynep, Kadir]

        System.out.println(ll3.element()); // Zeynep
        System.out.println(ll3.peek()); // Zeynep

        Queue<String> ll4 = new LinkedList<>();

        System.out.println(ll4.peek()); // null
        // System.out.println(ll4.element()); // NoSuchElementException (throws exceptions)


        /*
        peek ve element silmeden ilk elementi bize dondurur
        aralarindaki fark bos liste olursa peek null doner,
        element exceptions firlatir
         */

        ll3.offer("Maliksan");
        ll3.offer("Sefa");
        System.out.println(ll3); // [Zeynep, Kadir, Maliksan, Sefa]

        System.out.println(ll3.poll()); // Zeynep , ilk elemani siler ve sildigini dondurur
        System.out.println(ll3); // [Kadir, Maliksan, Sefa]
    }

}
