package day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface'de abstract olan 3 method'u implement ettigimizde
    Java itirazını durdurur
    sonradan ekledigimiz
    default veya static keyword ile tanimladigimiz methodları
    implement etmememiz sorun olusturmadi

    o zaman nicin 2 keyword yani static ve default tanimlanmistir ?
    bu 2 farkli kelimenin amaci
    child classlardan bu methoda nasil erisebilecegini belirlemek icindir
    static keyword kullanilirsa child classlardan bu methoda erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa methoda erismek icin obje olusturulmalidir

     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_Child obj = new C02_Child();
        obj.teker();
    }
}
