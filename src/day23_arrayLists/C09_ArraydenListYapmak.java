package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {

    public static void main(String[] args) {

        /*
        List ile calisirken en kotu ozelligi elemanlari tek tek eklemek
         */

        Integer [] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

        /*
        bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine array olusturup for loop ile
        olusturdugumuz List'e tasiyabiliriz

         */

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar); //[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /* bu islemi yapmasi icin Java'nin olusturdugu bir method da var
         ancak bu yontemin cok yan etkisi var

         1-bu sekilde olusturulan listeye add, remove gibi size'i degistiren method'lar KULLANILAMAZ
         2- asList method'u olusturulan liste ve kaynak olan array
         birbiri ile ilisik olarak hayatlarina devam ederler
         birinde yaptigimiz degisiklik otomatik olarak digerine de isler
         */

        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        /*
        sayilar2.add(5);
        System.out.println(sayilar2);
         */

        arr[0]=20;
        System.out.println(Arrays.toString(arr)); // [20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println("Array'de degisiklik yapinca sayilar2 : " + sayilar2); // Array'de degisiklik yapinca sayilar2 : [20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]














    }
}
