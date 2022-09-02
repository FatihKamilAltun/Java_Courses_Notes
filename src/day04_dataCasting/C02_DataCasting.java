package day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;

        System.out.println("sayi1/sayi2 = " + (sayi1/sayi2)); // ikisi de int olduğundan sonucu int kabul eder


        System.out.println(25*7/3); // 58.666 olmasına rağmen int olduğu için sonuç int oldu

        double sayi3=5;

        System.out.println(sayi1/sayi3); // 4.6 iki variable'ın data türü değişik olduğunda
                                         // daha kapsamlı olanı data türü olarak kabul eder

    }
}
