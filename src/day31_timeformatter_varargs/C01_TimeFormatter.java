package day31_timeformatter_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);

        // ilk olusturulan tarih : 2022-07-25T21:41:05.262606100

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy hh:mm");

        System.out.println(dtf1.format(tarihSaat)); // 25/7/22 09:45

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm a");

        System.out.println(dtf2.format(tarihSaat)); // 25/07/2022 21:49 ÖS
    }
}
