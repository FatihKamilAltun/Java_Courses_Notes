package day07_ifStatements;

public class C03_BasicIfStatements {

    public static void main(String[] args) {
        /*
        bir if statementste curly brases kullanilmazsa
        Java ilk satiri sart ile baglar sonraki satirlar bagimsiz olur

        eger birden fazla satir ayni if sartina bagli ise mutlaka curly brases kullanmaliyiz

         */

        int sayi = 23;

        if (sayi > 0)
            System.out.println("sayi pozitif");  // degere bagli
            System.out.println("pozitif kalacaktır");  // bagimsiz
            System.out.println("ucuncu satir");  // bagimsiz


        if (sayi % 2 == 0)
            System.out.println("sayi cift");  // degere bagli
        System.out.println("çift kalacaktır");  // bagimsiz


        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati");  // degere bagli

    }
}
