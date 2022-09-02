package day15_overloadingforloop;

public class C03_OverLoading {
    public static void main(String[] args) {


        topla(5,7); // 12
        topla(5.2,3); // 8.2
        topla(3.4,6.1); // 9.5

    }



    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integerin toplami : "+ (sayi1+sayi2));
    }
    /*
    bir class'da parametre sayisi ve parametre türleri ayni olan iki methodd olusturulamaz
    public static void topla(int sayi3,int sayi4){
        System.out.println("iki integerin toplami : "+ (sayi3+sayi4));
    */
    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double ve bir integer toplami : "+ (sayi1+sayi2));
    }



        public static void topla(int sayi1,double sayi2){
            System.out.println("bir integer ve bir double toplami : "+ (sayi1+sayi2));
    }

    public static void topla(double sayi1,double sayi2) {
        System.out.println("iki doublein toplami : " + (sayi1 + sayi2));
    }

}
