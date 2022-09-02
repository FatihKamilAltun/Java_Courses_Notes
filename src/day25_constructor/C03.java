package day25_constructor;

public class C03 {
    /*
    Proje olustururken bazi class'lar run etmek icin degil
    variable ve method
    olusturup bunları baska class'lardan kullanmak icin olusturulur
     */

    /*
    Default constructor, parametresizdir
    goremesek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    java default constructor'i siler
     */
    C03(){

    }

    /*
    olusturdugumuz parametresiz bu constructor
    default constructor ile birebir aynidir
    ama biz olusturdugumuz icin buna
    default constructor demeyiz
    parametresiz constructor deriz
     */
    String isim="Etka";


    public void method01(){
        System.out.println("C03 method calisti");
    }
}
