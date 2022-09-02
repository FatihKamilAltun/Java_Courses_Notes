package day18_while_doWhileloop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        // 9'dan 190'a kadar tum tam sayilari ekrana yazdirin



        int bas=9;
        int bitis=190;

        int temp=bas;

            // while ile
        while(temp<bitis){

            if (temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
        System.out.println("");

        // do while loop ile yapalim
        temp=bas;
        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } while (temp < bitis);

    }
}
