package day20_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println(sayilar); // [I@19dfb72a
        // non-primitive data turundeki datalari
        // her zaman direkt yazdiramayiz
        // Array'i yazdirmak istersek Arrays class'indan yardim isteriz

        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar); // [I@19dfb72a
        System.out.println(Arrays.toString(sayilar)); // [5 ,3 ,10]

        String sinifList[]= {"Kamil","Hazal","Sumeyye"};
        System.out.println(Arrays.toString(sinifList)); // [Kamil, Hazal, Sumeyye]

        sinifList[2]="Ayse";

        System.out.println(Arrays.toString(sinifList)); // [Kamil, Hazal, Ayse]

        System.out.println(sinifList[1]); // Hazal'i yazdiralim
        System.out.println(sinifList[0]); // Kamil'i yazdiralim
    }
}
