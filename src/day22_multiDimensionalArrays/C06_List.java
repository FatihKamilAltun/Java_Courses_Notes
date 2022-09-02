package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

    public static void main(String[] args) {
        /*
        arrayi array yapan sembol [] idi
        arrayList'de ise <> diamond kullaniriz
         */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler); //  []

        // bir List'e eleman eklemek istersek
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse")); // true döner

        /*
        String'de bir method çalıştırdığımızda assign yapmazsan String degişmiyordu

        String isim="Suleyman"
        isim.toUpperCase();  // SULEYMAN
        sout(isim) --> Suleyman
         */

        System.out.println(isimler); // [Basak, Ayse]


        /*
        List'in tek kötü tarafı array altyapısını kullandıgı icin
        elemanlari birer birer eklemek zorunda olmamızdır
         */

    }
}
