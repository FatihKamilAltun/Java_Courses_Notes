package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {

    public static void main(String[] args) {
        // Soru1-  Verilen bir int array'daki en buyuk sayiyi yazdşran bir method olusturun

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];  // index, arrayin ilk değerini atadık


        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }

        System.out.println("Array'deki en buyuk sayi : " + maxSayi);
    }
}
