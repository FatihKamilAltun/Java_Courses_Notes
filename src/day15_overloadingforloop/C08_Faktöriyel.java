package day15_overloadingforloop;

public class C08_Faktöriyel {
    public static void main(String[] args) {
        /*
        inpu olarak verilen bir tam sayi icin faktöriyel hesaplayıp yazdiran bir
        method olusturun.

        Verilen sayi negatif veya 20'den buyuk olursa
        "girilen sayinin faktöriyeli hesaplanamaz"
        uyarisi versin
         */

        int input=4;
        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {

        int faktoriyel=1;

        if (input<0 || input>20) {
            System.out.println("Girilen sayi icin faktoriyel hesaplanamaz");
        } else if(input==0){
            System.out.println("0!=1'dir");
        } else {
            for (int i = input; i >=1; i--) {
                faktoriyel*=i;

            }
            System.out.println("Faktoriyel degeri : " +faktoriyel);
        }


    }
}
