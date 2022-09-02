package day12_stringManipulations;

public class C04_substring {

    public static void main(String[] args) {
        String str="Java cok yasa";

        System.out.println(str.substring(3,4)); // a verir

        System.out.println(str.substring(5,7)); // 5'ten baslayip 5. ve 6. karakteeri alir : co

        System.out.println(str.substring(6,6)); // 0 tane alacak ve sonuc "" yani hiclik olacaktir

        System.out.println("=====");

        System.out.println(str.substring(6,2)); // exception


    }
}
