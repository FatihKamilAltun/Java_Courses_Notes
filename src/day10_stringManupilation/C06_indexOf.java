package day10_stringManupilation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf('o'));// 5
        System.out.println(str.indexOf("g")); //6

        System.out.println(str.indexOf("t")); // bana integer döndürüyor
                                              // int'de yok diye bir deger bulunmuyor
                                              // 0 dersek J'nin indexidir
                                              // negatif bir deger dönerse biz aranan stringin str'da olmadıgını anlarız
                                              // Java -1 döndürmeyi tercih etmiştir


        String str5="ssdasdas;Dasdöaskfndsbfsdfusdfsdfdsdnfdjfsdfdfjkdksfhshjdbfjsdf";

        // str 5'te s harfi var midir ?
        if (str5.indexOf("s")==-1){
            System.out.println("str'de istenen karakter kullanılmamıştır");
        } else {
            System.out.println("str5'te istenen karakter kullanılmıştır");
        }

    }
}
