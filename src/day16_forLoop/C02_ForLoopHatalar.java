package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        // baslangic noktasindan sonra
        // bitis sartina yaklasmiyorsak sonsuz loop olusur

        //for (int i = 0; i >-10 ; i++) {
        //    System.out.println(i);




        // eger ilk deger icin bile bitis sarti saglanmiyorsa
        // for loop calisir
        // ama loop body'si hicbir zaman devreye girmez(calismaz)

        for (int i = 0; i > 5; i++) {
            System.out.print(i);

        }
    }
}
