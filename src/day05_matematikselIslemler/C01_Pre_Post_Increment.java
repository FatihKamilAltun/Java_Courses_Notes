package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1; // sayi2--> 11

        sayi2+=5; //sayi2 --> 16
        /*
        pre veya post increment veya decrement
        sadece ++ ve -- işlemi için geçerlidir
        bu iki işlem sayıdan sonra veya önce yazılmasına göre
        bu iki işlem için farklı iki işleyiş olur
         */

        int sayi3=sayi2++;  // 1- sayı2 bir artırılacak
                            // 2- sayi2 değeri sayi3'e assign edilecek

        /*
        ++ veya -- variable'dan sonra olursa buna post ... denir
        bu durumda o satırda yapılan iki işlemden artırma veya azaltma islemi sonucudur   artırma veya azaltmadır.
         */

        System.out.println("sayi3 : " + sayi3); //
        System.out.println("sayi2 : "+ sayi2); //

        int sayi4=++sayi1;  // 1- sayi1 in değeri bir artırılacak
                            // 2- sayi1 değeri sayi4'e assign edilecek

        /*
        eğer ++ veya -- variable'dan önce ise buna pre.... denir
        bu durumda o satırda yapılan iki işlemden öncelikli olan
        artırma veya azaltma
         */

        System.out.println("sayi4 : " + sayi4); //
        System.out.println("sayi1 : "+ sayi1); //




    }

    public static class C04_ExplicitNarrowing {

        public static void main(String[] args) {

            int sayi1=500;

            byte sayi2= (byte) sayi1;


            System.out.println(sayi2); // 50

            /*
            Geniş data türündeki değeri, dar data türündeki variable'a assign etmek isterseniz
            Java sizin geniş data türündeki değerin, dar data türünün
            sınırlarına uyup uymayacağını çalıştırana kadar bilemez
            ama Java Risk almaz.
            Riski sıfıra indirmke için burada bir sorun olursa sorumluluğu kabul etmenizi bekler.
            bunun için değerin önüne parantes içerisinde istediğimiz data türünü
            yazmamız yeterlidir.

            Bu riski üstlendiğimizde, 3 durum oluşabalir;
            1- bizim değerimiz dar kalıp degerlerine uygun olursa hiç bir kayıp olmadan cast olur
            2- double bir sayıyı int' cast edersek data kaybı yaşayabiliriz
            3- geniş kalıptan değeri dar kalıba koyduğumuzda sınırlarını aşan durumlarda
            veri başkalaşabilir.

             */

        }
    }
}
