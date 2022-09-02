package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binerySearch methodu siralanmis array'da aradigimiz elementin indexini döndürür

        ya aradigimiz element array'de yoksa ?
        (String'de indexOf() bize olmayan elementler için -1 döndürüyordu)
        Aradigimiz element array'da yoksa Java hem olmadigini hem de olsaydi nerede olacagini bize döndürür,
        olmadigini ifade etmek icin - kullanir, olsaydi nerede olacagini belirtmek icin index degil siralama kullanir


         */

        int [] sayilar= {3,7,15,4,27,10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));  // [3, 4, 7, 10, 15, 27]

        // istenen element array'de varsa INDEX, yoksa -SIRA

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4

        System.out.println(Arrays.binarySearch(sayilar,11)); //  -5  (- bu elemanın olmadigini, 5 ise sirasini belirtiyor)

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1


    }
}
