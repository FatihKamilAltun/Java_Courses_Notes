package day11_stringManupilations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        // Verilen bir String'de herhangi bir String veya char'in ilk kullanıldigi
        // indexi bize döndürür

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); // 10

        // eger istedigimiz index'ten sonrasını kontrol etmek istersek o zmana
        // aynı ( )'u 2 parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",(6+1)));  // yazılan index'ten başlar


        // yukaridaki str'da ikinci ve üçüncü e'nin index'lerini bulun
        // 2. e'yi bulabilmek icin 1. e'nin indexine ihityacim var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",(ilke+1));

        // eger 2. e varsa 3. e'nin olup olmadigini ve varsa indexini yazdiralim

        if (ikincie==-1){
            System.out.println("verilen str'da 2. e yok");
        } else {
            int ucuncue=str.indexOf("e",(ikincie+1));
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");
            } else {
                System.out.println("verilen str'daki 3. e'nin indexi : " + ucuncue);
            }


        }
        System.out.println();
    }
}
