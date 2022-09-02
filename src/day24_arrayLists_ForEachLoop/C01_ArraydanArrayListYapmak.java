package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydanArrayListYapmak {
    public static void main(String[] args) {

        String [] arr={"Ismail","Nurullah","Fatih"};

        /*
        zun listeler olusturmamiz gerektiginde tek tek eklemek yerine array olusturup bunları List'e cevirmek daha pratik olabilir
        1- Loop ile array'daki tum elementleri List'e atabiliriz
        2- Arrays.asList() kullanabiliriz
            Ancak bu method'un 2 tane kotu yan etkisi vardır
            - Arrays Class'i kullanıldigi icin array ozellikleri gecerli olur
            dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
            bu sekilde olusturulan list'lerde ozdeslestirilir
            - kaynak olan array ile urun olan list ozdeslestirilir
            birinde yapilan degisiklik, otomatik olarak digerine de islenir
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

        // 1. yan etki
        // sinifList.add("Erdi"); // UnsupportedOperationException
        // sinifList.remove(1); // UnsupportedOperationException

        // 2. yan etki

        arr[1]="Emre";
        System.out.println("Degisim sonrasi array : " + Arrays.toString(arr));
        System.out.println("Array'i degisitirince list : " + sinifList);

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list : " + sinifList);
        System.out.println("List'İ degistirince array : " + Arrays.toString(arr));








    }
}
