package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {


        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri " + kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes","Actross",2005,500000);
        System.out.println("kamyon2 ozellikleri " + kamyon2.toString());

        Kamyon kamyon3=new Kamyon("MAN","as900",2007,400000);
        System.out.println("kamyon3 ozellikleri " + kamyon3.toString());

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("kamyon4 ozellikleri " + kamyon4.toString());
    }
}
