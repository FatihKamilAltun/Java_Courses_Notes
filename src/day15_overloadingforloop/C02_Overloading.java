package day15_overloadingforloop;

public class C02_Overloading {

    public static void main(String[] args) {
        /*
        Javada olustugumuz methodlarin isminin yaptigi isler ile
        uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin
        2 adet substring() method'lari veya
        verilen String'deki bazi parcalari yenileriyle degistirmek icin
        2 adet replace() methodu var

        Java ayni isimde birden fazla method varsa hangisini kullanılacağına
        parametre sayisi ve parametrelerin data type'ina göre karar verir
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,3);

        str.replace('c','v');
        str.replace("J","H");
        // str.replace(5,8);

        /*
        Ayni isimde ama farkli methodlari olusturmak icin
            degistirebilecegimiz seyler
            1-parametre sayisi
            2-ayni sayida parametreye sahip olsa bile parametrelerin data type'larini degistirebiliriz
            3-Ayni sayi ve ayni data type'larinda parametreleri olan methodlarda
            parametrelerin siralanisi
         */

    }
}
