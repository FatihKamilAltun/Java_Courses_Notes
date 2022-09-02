package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*
        tek katlı arraylerde array'i direkt yazdiramiyoruz.
        cunku array non-primitive data turudur ve
        her non-primitive data direkt yazdirilamayabilir

        ancak array'in icerisindeki elementleri direkt yazdirabiliyorduk
        cunku genelde primitive data turu veya String elementler kullaniliyordu

        Multi-dimensional array'lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitve data mi oldugudur
         */

        int [][] sayilar={{1,2,4,5},{3,4}};
        /*
        burada sayilar array'ini dusunursek 2 tane inner array var
        sayilar[0]--->[1,2,4,5]

        ancak en icerideki elementlere ulasirsak direkt yazdirabiliriz
         */
        System.out.println(sayilar[0]); // ---->  [I@19dfb72a  arrayler direkt yazdrilmadigi icin referans geldi
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@19dfb72a, [I@17c68925] ----> outter arrayin icerisinde 2 tane inner array oldugu icin 2 referans verdi

        System.out.println(Arrays.deepToString(sayilar));  // [[1, 2, 4, 5], [3, 4]]

        /*
        Array'i iki şekilde deklare edebiliyorduk

        1-- elemanları direkt yazabiliriz

        int [][] sayilar={{1,2,4,5},{3,4}};


        2-- outer ve inner arraylerin uzunluklarini belirterek olusturabiliriz

        int [][] sayilar=new int[3][4];


        ancak 2. yontemle yaptigimizde inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer arrayin 3 tane inner arrayi vardır
        herbir inner arrayin ise 4 er elemani  vardır

        eger inner arraylerdeki farkli uzunluklarda olusturmak istiyorsaniz mecburen 1. yontemi kullanmalisiniz

         */



    }
}
