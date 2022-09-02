package day11_stringManupilations;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="kolay";

        /*
        verilen kelime icin assagidaki sartlardan uygun olani yazan programi yaziniz

        - verilen kelime cumlede kullanilmamis
        - verilen kelime cumlede 1 kere kullanilmis
        - verilen kelime cumlede birden fazla kullanilmis
        */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else {
            if (kelimeSonIndex==kelimeIlkIndex) {
                System.out.println("verilen kelime cumlede 1 kez kullanilmis");
            } else {
                System.out.println("verilen kelime cumlede birden fazla kullanilmis");
            }
        }





    }
}
