package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment : " + ++sayi);  //artırma ve yazdırma işlemi var, "pre" olduğu için önce artırma sonra yazdırma olur

        System.out.println("post-increment : "+ sayi++);  //yine iki tane işlem var, "post" olduğu için önce yazdırma işlemi yapar sonra artırma yapılır

        System.out.println("post-increment'den sonra : " + sayi); // bir üst satırda önce yazdırıldığı sonradan sayinin değeri artırıldığı için yeni değer 12 bu satırda işlem görür ve yazdırılınca 12 yazar


    }
}
