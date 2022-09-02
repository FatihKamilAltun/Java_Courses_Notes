package day24_arrayLists_ForEachLoop;

public class C07_ArraydekiSayilarinKareToplam {

    public static void main(String[] args) {
        int[] sayilar= {2,3,4,1,5,7,6,5,4,3};

        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each*each;
        }
        System.out.println("Kareler toplami : " + toplam);
    }
}
