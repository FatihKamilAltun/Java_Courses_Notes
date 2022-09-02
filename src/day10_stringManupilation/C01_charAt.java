package day10_stringManupilation;

public class C01_charAt {

    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdırır "J"

        System.out.println(str.toUpperCase().charAt(7)); //7. indexi yani sekizinci harfi buyuk olarak yazdırır "R"

        System.out.println(str.charAt(21)); // en son harfi yani "l"i verir

        // System.out.println(str.charAt(22)); // ne olur "StringIndexOutOfBoundsException"
        // son harfi bulmak icin str'nin uzunlugunun bir eksigini gireriz
        // eger index olarak uzunlugu veya daha buyuk bir sayi girersek exception verir


        // charAt() kullandıgımızda sonuc char olacagı icin artik manipulation yapamayiz
        // String methodlarindan kullanmamiz gereken bir method varsa
        // charAt()'den once kullanmaliyiz
    }
}
