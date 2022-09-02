package day37_overriding;

public class DAraba {

    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
        /*
        Parent class'dan override edilmesini istemediğimiz
        methodlari private, static, final yapabilirsiniz
         */
    }

    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }



}
