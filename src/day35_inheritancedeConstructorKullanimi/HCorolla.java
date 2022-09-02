package day35_inheritancedeConstructorKullanimi;

public class HCorolla  extends GToyota{
    HCorolla(){
        System.out.println("HCorolla parametresiz cons");
    }
    HCorolla(String isim){
        super(isim);
        System.out.println("HCorolla parametreli cons");
    }
}
