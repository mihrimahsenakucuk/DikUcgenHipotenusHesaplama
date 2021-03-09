import java.util.Scanner;

public class HipotenusHesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk kenarınızı giriniz: ");
        int kenar1 =scan.nextInt();

        System.out.println("İkinci kenarınızı giriniz: ");
        int kenar2= scan.nextInt();

        double kenar3= Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2);

        System.out.println("Hipotenüs: " + kenar3);
    }

}