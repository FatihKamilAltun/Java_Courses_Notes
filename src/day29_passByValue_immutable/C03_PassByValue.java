package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        bir list olusturalim
        2 ayri method'dan birinde
        sadece elamanlari degistirelim


        digerinde yeni bir list atayip
        ayni sayida yeni eleman ekleyelim

        ve her 2 method call'dan sonra kendi listimizi
        main method icerisinde kontrol edelim
         */

        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list : " + list); // [Ali, Veli, Can]

        elamanlariDegistir(list);

        System.out.println("elemanDegistir method'undan sonra listemiz : " +list);
        // [Oguz, Murat, Fatih]

        listDegistir(list);

        System.out.println("listDegistir method'undan sonra : " + list);
        // [Oguz, Murat, Fatih]
    }

    public static void listDegistir(List<String> list) {

        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("listDegistir method'unda : " + list);
        // [Nutella, Cay, Cokokrem]
    }

    public static void elamanlariDegistir(List<String> list) {

        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("elemanlariDegistir method'unda : " + list);
        // [Oguz, Murat, Fatih]

    }


}
