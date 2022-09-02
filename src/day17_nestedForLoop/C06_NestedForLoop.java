package day17_nestedForLoop;

public class C06_NestedForLoop {

    /*
    verilen Strign'i asagidaki gibi yazdiran bir program yazalim

    ornek: input= Deniz

    D
    De
    Den
    Deni
    Deniz


     */
    public static void main(String[] args) {
        String input="Deniz";
        for (int i = 1; i <= input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
    }


}
