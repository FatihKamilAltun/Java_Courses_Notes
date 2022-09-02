package day42_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI=30;
    /*
    Interface bir classs degildir

    Abstract classlar javada abstraction(soyutlaştırma) kural koyma işlevini
    yapıyordu ancak abstract bir classda abstract olmayan methodlar da olabilir
    bu da full abstraction tapmaya izin vermez
    eger javada içinde hiç concrete method olmasın dedigimiz
    bir class olusturmak icin bunu class degil interface yapmalisiniz

    1- INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2- ınterface'ler full abstraction yaptigindan ınterface'lerden obje olusturulamaz

    Hatırladiniz gibi interface olan list'den direkt obje olusturlamiyordu
    List<String> list= new List<>(); calismaz
    Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
    List<String> list= new ArrayList<>();

    3- classlarda bir child birdan fazla parent edinemez
    ancak interface'lerde concrete method olmadigindan biz her methodu child classda override etmek zorundayiz
    override ederken kimin söyledigini override ettiğimizin önemi yok

    4- interface'ler neyin yapilmasi gerektigini soyler
    ama nasil yapilacagina karismaz

     */


}
