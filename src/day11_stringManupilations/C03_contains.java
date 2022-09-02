package day11_stringManupilations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*
        Kullanıcıdan email adresi girmesini isteyin,
        mail  @gmail.com icermiyorsa, "lutfen gmail adresi giriniz";
        "@gmail.com" ile bitiyorsa "email adresininz kaydedildi";
        "@gmail.com" ile bitmiyorsa lutfen yazinizi kontrol edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazinizi kontrol ediniz");
        }
    }
}
