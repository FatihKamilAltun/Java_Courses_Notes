package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {

    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    parent'i olan tum classlardaki abstract method'lari
    concrete hale donusturmek (override etmek) ZORUNDADIR

    bu kuralin istisnasi
    parnet classlardan herhangi birinde
    concrete hale donusturulmus abstract method'lardir
     */

    public static void main(String[] args) {

        HA160 araba1 = new HA160();
        // concrete bir class'dan istedigimiz objeyi uretebiliriz

        FMercedes araba2 = new FMercedes();
        // mercedes de concrete

        // EToyota araba3= new EToyota();
        EToyota araba4=new GCorolla();
        // Abstract class'lar constructor barindirir ama obje uretemezler
        // Toyota class'i abstract class oldugundan obje URETILEMEZ

        /*

        List<String> list1=new List<String>();
        List<String>list2=new ArrayList<>();


        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        data turunu istedigimiz abstract class
        constructor'u ise child'i olan concrete bir class'dan seceriz
         */

    }
}
