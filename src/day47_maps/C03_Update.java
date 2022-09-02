package day47_maps;

import day46_maps.ReusableMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(key) ==> verdigimiz key'in map'ta olup olmadigini boolean olarak doner
        map.contains(value) ==> bir butun olarak value'nun map'ta olup olmadigini doner

        ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                    Eger value icindeki bir parcayi aratmak istiyorsak
                    map uzerinde manupilation yapmamiz lazim

        map.get(key) ==> verilen key'e ait degeri dondurur

         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("Jdev")); // false

        // verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'i degistirmek istersek kullanilabilir
        // kısmi degisikliklerde kullanamayiz

       ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // map'i guncelleme yapmak icin key, yenideger', map'e eklemeliyiz
        // ornegin key 101 icin value Ali. Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)

        // bunu yapabilmez icin her bir key'e ve ona ait value'a ihtiyacim var

        Set<Integer> keySeti = sinifListMap.keySet();

        String eachValue;
        for (Integer each: keySeti
             ) {
            eachValue=sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            biz key'lerin tamamini aldik
            her bir key'in value'sını getirdik
            value uzerinde degisikligi yapip
            yeni halini put(key,yeniDeger) ile map'e koyduk
             */
        }

        System.out.println(sinifListMap);

    }
}
