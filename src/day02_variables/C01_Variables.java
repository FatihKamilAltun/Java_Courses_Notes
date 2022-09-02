package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {

        int             not             =            60                    ;
        //data türü     variable ismi   assigment    sign variable değeri  bu satırda yapacağım işlem bitti //

        int not2   =   75;
        //variable  değer //
        //java önce değeri yapar yani sağ taraftaki işlemi yapar sol tarafa atar//

        //not2'yi 90 yapalım //

        not2=90;

        // yeni bir int variable oluşturalım değeri ilk iki variablenin ortalaması olsun//

        int ort = (not+not2)/2;

        System.out.println("Sayıların ortalaması :" + ort);

        // "" içinde yani çift tırnak içerisinde yazılan her şey metindir yani string'tir. java tırnak içinde ne görürse onu aynen yazdırır //
        //eğer bir variablenin değerini yazdırmak istiyorsanız çift tırnak olmadan variablenin ismini yazabilirsiniz //

    }
}
