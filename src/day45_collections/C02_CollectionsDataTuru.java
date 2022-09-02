package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {

    public static void main(String[] args) {
        /*
        Collections <dataTuru> nu Object secmeniz durumunda
        Collections'a farkli data turunden objeler koymaniza izin verir
        bu, depolama acisindan bize esneklik saglar
        ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir
        */



        List<String> liste= new ArrayList<>();
        // liste.add(5);
        // liste.add('s');
        // liste.add(true); data type'lar farkli oldugundan eklenemedi

        List list= new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");


        System.out.println(list); // [5, s, true, Ali]
        list.set(0,(Integer)list.get(0)+5); // [10, s, true, Ali]
        list.set(3,list.get(3)+"Can"); // [10, s, true, AliCan]
        System.out.println(list);
        list.set(2,!(Boolean)list.get(2)); // [10, s, false, AliCan]



        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(false);
        set1.add('5');

        System.out.println(set1);
    }
}
