package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class'da oldugumuzu dusunursek
    2 tane access modifier kullanma ihtimali OLAMAZ


    asagidaki method'da goreceginiz gibi
    interface'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java8'den sonra kullanilmaya baslamistir
    bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tüm classlaara gidip
    yeni eklenen method'u override etmemiz gerekirdi

    bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu methodun child classlar tarafindan override edilme mecburiyeti olmaz
    ve eskiden implement etmis classlari degistirmemiz gerekmez

    bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz

    bu method'larin body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir

    o zaman nicin 2 keyword yani static ve default tanimlanmistir ?
    bu 2 farkli kelimenin amaci
    child classlardan bu methoda nasil erisebilecegini belirlemek icindir
    static keyword kullanilirsa child classlardan bu methoda erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa methoda erismek icin obje olusturulmalidir

     */

    public default void teker (){
        System.out.println("default...Tum arabalarin tekeri vardir");

    }
    public static void direksiyon(){
        System.out.println("static...Tum arabalarin direksiyonu vardir");
    }
}
