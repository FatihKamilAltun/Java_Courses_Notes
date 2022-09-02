package day13_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        // input olarak verilen 2 integer'i toplayip sonucu yazdiran
        // bir method olusturun

        int input1=20;
        int input2=20;

        // method 4 adimda olusturulur
        // 1. adim method call
        // 2. adim argumant eklenmesi gerekiyorsa ekleyelim
        //  eger methodun return type'i voidden farkli oalcaksa
        //  bir variable olusturup method call'i assign edelim


        topla(input1,input2);


    }
    public static void topla(int input1, int input2){
        // 3. adim method deklerasyonunda degistirilmesi gereken
        // bolumleri degistirir (access modifier. return Type vb..)
        // 4. eger return type void disinda bir seyse
        //   return keyword'u ve donecek degeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami : " + (input1+input2));
    }


}
