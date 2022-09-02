package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati));  // 90

        System.out.println(satisFiyati); // 100

        System.out.println(indirimliFiyat(satisFiyati)); // 90
        // iki farkli method'da satis fiyati isminde variable olabilir
        // Java buna itiraz etmez. cunku scope'lari farklidir.
    }

    public static double indirimliFiyat(double orijinalFiyat){

        // methodumuz %10 indirim yapip
        // yeni fiyati main method'a dondursun
        double satisFiyati=orijinalFiyat*0.9;

        return satisFiyati;

    }

}
