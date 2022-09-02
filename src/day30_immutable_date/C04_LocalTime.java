package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now();
        System.out.println(time1); // 19:12:17.434428
        /*
        Bizim olusturgumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda
        o anki tarih veya saati alip
        bizim variable'imiza store eder.
        time1 variable'inin degeri SABITTIR

         */

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1); //

        System.out.println(time1.getSecond()); // 38

        System.out.println(time1.plusSeconds(10000)); // 22:18:18.880926900

        System.out.println(time1.minusMinutes(150000)); // 15:33:22.220215700

        System.out.println(time1.plusHours(150).plusHours(5).plusMinutes(15000));

        System.out.println("with : " + time1.withHour(3)); // saati 3 yapip yazdirdi


    }
}
