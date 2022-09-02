package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {

    public static void main(String[] args) {
        //  Soru-4 Kullanicidan bir arrayin boyutunu ve tum elemntlerini alarak bir array olsuturup,
        // bu arrayi bize döndüren bir method olusturun

        int[] sayilar=arrayOlustur();
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanli bir Array olusturmami isterisiniz");
        int uzunluk=scan.nextInt();
        int[]olusturulan=new int[uzunluk];


        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+". index icin sayi giriniz");
            olusturulan[i]=scan.nextInt();

        }



        return olusturulan;
    }
}
