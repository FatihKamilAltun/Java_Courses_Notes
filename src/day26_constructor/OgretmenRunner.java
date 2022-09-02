package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {


        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen1 : " + ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Fatih Kamil","Altun","1/1/1996","Matematik","Yazilim");
        System.out.println("Ogretmen2 : " + ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Cavidan","Aynakiran","2/2/1985");
        System.out.println("Ogretmen3 : " + ogretmen3);

    }
}
