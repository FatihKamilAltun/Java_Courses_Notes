package day15_overloadingforloop;

public class C06_StringTerseCevirme {

    public static void main(String[] args) {
        /*
        String olarak verilen bir inputu terse ceviren ve yazdiran bir method olusuturalim
         */

        String input="Java gun gectikce guzellesiyor";

        terstenYazdirma(input);
    }

    public static void terstenYazdirma(String input) {

        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);


        }
        System.out.println(tersInput);
    }
}
