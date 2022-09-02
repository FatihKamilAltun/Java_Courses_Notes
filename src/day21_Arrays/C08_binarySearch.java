package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        // Binary search javada eleman aramanin kisa yoludur,
        // ancak binary search'un calismasi icin once array'in sirali hale getirilmesi gerekmektedir
        // eger siralama yapmadan binarySearch yaparsaniz
        // sonucu bulamayabilir veya yanlis bulabilirsiniz

        String [] harfler={"Y","B","D","G","O","A"};

        String arananHarf="Y";



        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        // binarySearch bize aradigimiz elemanin index'ini döndürür
        // Array sirali olmadigi icin arama sonucunu dogru bulamayabilir emin olmak icin once sort etmek gerekir

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

    }
}
