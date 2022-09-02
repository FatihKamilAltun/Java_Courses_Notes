package day18_while_doWhileloop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın
        ve bu sayının rakamları toplamını yazdırın
         */

        int input=32993513;
        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;


       while (temp>0) {
           birlerBasamagi = temp % 10;
           rakamlarToplami += birlerBasamagi;
           temp /= 10;
       }
        System.out.println(input+" sayisinin rakamlar toplami : "+rakamlarToplami);





    }
}
