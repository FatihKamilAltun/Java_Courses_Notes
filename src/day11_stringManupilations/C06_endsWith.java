package day11_stringManupilations;

public class C06_endsWith {

    public static void main(String[] args) {
        /*
        Kullanıcıdan email adresi girmesini isteyin,
        mail  @gmail.com icermiyorsa, "lutfen gmail adresi giriniz";
        "@gmail.com" ile bitiyorsa "email adresininz kaydedildi";
        "@gmail.com" ile bitmiyorsa lutfen yazinizi kontrol edin yazdirin
         */

        String input="fatih@gmaile.com";


        if (!input.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresinizi giriniz");
        } else if (input.endsWith("@gmail.com")){
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazinizi kontrol ediniz");
        }
    }
}
