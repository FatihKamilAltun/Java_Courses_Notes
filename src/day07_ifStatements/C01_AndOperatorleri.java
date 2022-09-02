package day07_ifStatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);  // treu olur

        System.out.println(a<0 && b<20 && c>=b);  // false olur bir tane false olmasi durumu sonucu sifir yani false yapti

        // Java bize iki operator sunar. && operatorunu kullanirsak ilk yanlista sonucu false print eder diger sartlara bakmaz
        // ama & operatorunu kullanirsak yanlis gorse de diger sartlari da kontrol eder ve sonucu tum sartlari kontrol ettikten sonra yazdirir. bu yuzden yavaslik durumu ortaya cikar
        // bu calisma usulundan dolayı & operatoru &&'e gora daha yavas olabilir
        // && operatoru kullanildiginde  uc önermeden biri false olunca mukmmelliyet kirildi ve geri kalan onermelere bakmadan sonucu sifir yapti
        // & operatoru kullanildiginda yanlisla karsilasirsa dahi uc onermeyi de kontrol eder ve her bir onermenin dogru veya yanlisligine bakar ve bu bize zaman kaybettirir



    }
}
