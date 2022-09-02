package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {

    public static void main(String[] args) {

        /*
        Birden fazla elemt iceren array ve arrayList gibi yapilarda da
        passByValue gecerlidir.

        Eger method'da array veya list'in kendisi degistirilirse
        passByValue ozelligi sebebiyle Java degisen degeri degil
        array veya List'in orijinal degerini alir

        Ancak array veya List degistirilmeden
        sadece icindeki elemanlar degistirilirse
        Java obje degismedigi icin (referans ayni),
        ayni array veya List'i bize dondurur.
        ancak icindeki elementler degisimis olacaktir


         */

        /*
        verilen 4 elemanli bir array'i
        method'a gonderelim
        method'da yeni 3 elemanli bir array atayip
        bu yeni array'e rastgele 100'den kucuk 3 sayi atayalim
        method da array'i yazdiralim

        main method'da da method call'dan sonra yeniden method'u yazdiralim
         */

        int[]arr ={3,5,8,10};

        arrayiDegistir(arr);
        System.out.println("Method calldan sonra main method'da array : " + Arrays.toString(arr));
    }

    public static void arrayiDegistir(int[] arr) {

        arr =new int [3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);

        System.out.println("Method'da array : " + Arrays.toString(arr));
    }
}
