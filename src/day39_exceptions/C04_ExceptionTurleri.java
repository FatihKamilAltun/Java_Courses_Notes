package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Deger atamasi yapmadan bir variable'i kullanmaya baslarsaniz
        Java Compile Time'da bunu farkeder ve size izin vermez
         */
        str=null;

        // System.out.println(str.length());
        // NullPointerException run time exception'dir

        Object obj="Java Java Java";
        Integer sayi=(Integer) obj; // ClassCastException

        /*
        String str2="Hava Civa";
        Integer sayi2=(Integer) str;

        Java bazi casting islemelerine compile time'da izin vermeyebilir
        Ancak bazen syntax uygun olabilir
        bu durumda java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000);






    }
}
