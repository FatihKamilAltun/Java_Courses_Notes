package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
//dar veri türündeki bir değeri, geniş veri türündeki variable'a
        //otomatik olarak assign eder
        byte sayi1=23;
        short sayi2=55;

        int sayi3=sayi1+sayi2;  //78

        double sayi4=sayi1*sayi2; //1265.0


        sayi4=sayi2/sayi1; // 2.391--> 2 gösterir çünkü önce işlem yapar önce sağı yapar ikisi de int olduğu için sonuç da int oldu

        sayi4=(double) sayi2/sayi1; //2.391 gösterir çünkü sayılardan birisini double yaptık



    }
}
