package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1= new Araba();
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildik, degistirebildik(set) ve yazdirabildik(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        // acces modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz "model"e ise hic olusamayiz
        // yani acces modifier ya hep ya hic diyor

        // model'i degistirelim ama goremeyelim
        // yakit'i gorelim ama degsitiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1. adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //           private bir data'ya baska class'lardan ulasmak mumkun olmadigindan
        // 2. adim - set yetkisi icin sette, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Corolla"); // model olarak Corolla'yi atadik
        // model'i yazdirma imkanimiz yok, cunmku getter method'u yok
        System.out.println(arb1.getYakit()); // 'Elektrikli' bilgisini yazdirabildik
        // yakiti degistiremeyiz, cunku setter method'u yok

    }
}
