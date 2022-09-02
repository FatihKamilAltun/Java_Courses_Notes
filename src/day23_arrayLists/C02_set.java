package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
         /*
    elimizde ürünlerin bulundugu bir liste var
    ürün listesindeki istenen siradaki urunu istedigimiz yeni ürünle degistirip
    eski ürünü, varolan eski ürünler listesine ekleyelim
     */


        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");





        List<String> eskiUrunler=new ArrayList<>();
        // listedeki ikramın yerine biskrem koyalim,
        // ikramı da eski ürünler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";


        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+ urunler);
        System.out.println("Eski urunler listesi : "+ eskiUrunler);

         yeniUrun="Kahve";
         silinecekUrun="Cay";


         temp=urunler.indexOf(silinecekUrun);
         silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+ urunler);
        System.out.println("Eski urunler listesi : "+ eskiUrunler);

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";


        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+ urunler);
        System.out.println("Eski urunler listesi : "+ eskiUrunler);















    }


}
