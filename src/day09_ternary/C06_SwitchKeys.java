package day09_ternary;

public class C06_SwitchKeys {

    public static void main(String[] args) {
        /*
        kullanicidan gun ismini alin
        haftaici veya haftasonu oldugunu yazdirin
         */

        // Scanner scan=new Scanner(System.in);
        // System.out.println("Lütfen bir gun giriniz");

        String input="kamil";
        input=input.toLowerCase();
        switch (input){
            case "pazartesi" :
                System.out.println("Hafta ici");
                break;
            case "sali" :
                System.out.println("Hafta ici");
                break;
            case "carsamba" :
                System.out.println("Hafta ici");
                break;
            case "persembe" :
                System.out.println("Hafta ici");
                break;
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumertesi" :
                System.out.println("Hafta sonu");
                break;
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz");
        }


        switch (input){
                case "pazartesi" :
                case "sali" :
                case "carsamba" :
                case "persembe" :
                case "cuma" :
                    System.out.println("Hafta ici");
                    break;
                case "cumertesi" :
                case "pazar" :
                    System.out.println("Hafta sonu");
                    break;
                default:
                System.out.println("Gecerli bir gun giriniz");

        }
    }
}
