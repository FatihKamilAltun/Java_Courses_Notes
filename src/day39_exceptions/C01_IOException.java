package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya
        ekleme veya update yapmak istersek FileOutputStream Class'indan
        yardim aliriz.
         */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        compile time error degildir
        Java'da bazi exception'lar da
        compile time exception'dir
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile time exception'dir.

        Compile time exception olustugunda Java cozum icin 2 ihtimal onerir
        1- try-catch ile cevrelemek
        2- method signature'ina throws keyword ile beklenen exception turunu yazmak

        throws exception, sadece olayin farkinda oldugumuzun deklerasyonudur
        exception'in handle edilmesinde hicbir rolu yoktur
        yani try-catch ile handle ettigimiz (kontrol altina aldigimiz) exception'larda
        kod calismaya devam ediyordu
        Ancak throws exception yazdigimizda java bir exception ile karsilasirsa
        yine hicbir sey yapmamaisiz gibi hata mesaji yayinlayip calismayi durdurur
        */
    }
}
