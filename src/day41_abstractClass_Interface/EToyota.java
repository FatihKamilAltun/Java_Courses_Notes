package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {


    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    Paretn class'daki standart belirleyici method'larin yani abstract methodlarin tamami
    child class tarafindan override edilmelidir

    concrete methodlarin override edilme mecburiyeti yoktur
    istersek override edebilir istemezsek etmeyebiliriz

    aslinda toyota class'i da obje uretebilecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class'ini da abstract yapmamiz guzel olur
     */
}
