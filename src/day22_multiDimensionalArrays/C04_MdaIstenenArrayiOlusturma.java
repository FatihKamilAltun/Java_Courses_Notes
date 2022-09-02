package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {

         /*

        Asagidaki multi dimensional array'in
        ic arraylerindeki tum elementlerin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni arrayi ekrana ayzdiran bir program yaziniz

        ornek;   { {1,2,3},{4,5},{6,7} } ==> 1+2+3=+ 4+5=9 6+7=13 ==> output {6,9,13}

    */

        int [][] input={ {1,2,3},{4,5},{6,7} };
        int[] yeniArray=new int[input.length];
        int toplam=0;


        for (int i = 0; i < input.length; i++) {  // dis loop outer array'i gezer
            for (int j = 0; j <input[i].length ; j++) { // ic loop inner array'i gezer
                toplam+=input[i][j];

            }
            yeniArray[i]=toplam;
            toplam=0;

        }
        System.out.println("Istenen yeni array : "+ Arrays.toString(yeniArray));

    }


}
