package day31_timeformatter_varargs;

public class C04_VarargsIleEnEuzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Kamil","Ahmet","Babayigit");

    }
    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each: kelime
             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }

        System.out.println("Girilen kelimelerden en uzunu : " + enUzunKelime);



    }


}
