package day18_while_doWhileloop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
       /*
       while loop'ta once kontrol edip sonra islem yaptigimiz icin
       islem bittikten sonra loop'un kirilmasi icin bir kez daha basa dönmemiz gerekiyor
       bu yuzden fazladan bir islem yapiliyor
        */

        int sayi=7;

        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }

        /*
        do while loop ile calistigimizda bu dezavantaj ortadan kalkar
        */

        sayi=7;

        do {

            System.out.println(sayi);

            sayi++;

        }while (sayi<10);
    }
}
