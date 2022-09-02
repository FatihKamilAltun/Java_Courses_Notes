package day41_abstractClass_Interface;

public  abstract class DAraba {

    public static void main(String[] args) {
        /*
         abstract class'da main method opsiyoneldir
         Eger abstract class sadece child class'larin tasimak zorunda oldugu ozellikleri
         belirlemek icin olusturulduysa main method'a ihtiyac olmaz
         sadece abstract method'lar olur


         ama bir abstract method'da
         standart belirlemek disinda da method'lar calisabilir
         bu durumda ihtiyac olursa main method olusturulabilir
         */

    }
    public abstract void yakit();


    public abstract void kaporta();


    public abstract void motor();
    /*
    sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
    abstract method olur ve abstract method'larin body'si olmaz
    */

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract olmayan method'lara concrete method denir
        abstract bir method'u abstract keyword ile belirtmek zorunludur
        concrete method'larda bunun deklare edilmesine gerek yoktur
        biz sadece abstraction ile ilgiili konustugumuzda
        abstract olmayan method'lardan bahstemek icin concrete tabirini kullaniriz
         */
    }


}
