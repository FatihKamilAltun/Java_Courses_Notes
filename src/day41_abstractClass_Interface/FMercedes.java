package day41_abstractClass_Interface;

public class FMercedes extends DAraba {
    @Override
    public void yakit() {
        /*
        abstract bir parent'in concrete child class'i inherit ederse
        parent abstract class'daki tum abstract method'lari
        override etmek zorundadir

        abstract bir class, abstract baska bir classi parent edinirse
        parent class'daki tum abstract method'lari override etmek
        zorunda degildir
         */
    }

    @Override
    public void kaporta() {

    }

    @Override
    public void motor() {

    }
}
