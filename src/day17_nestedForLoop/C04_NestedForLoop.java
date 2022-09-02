package day17_nestedForLoop;

public class C04_NestedForLoop {

    /*
    verilen inputa gore *'lardan olusan bir ucgen
    olusturun

    ornek: input=4 ise

               *
               * *
               * * *
               * * * *

     */

    public static void main(String[] args) {


        int input=6;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }
}
