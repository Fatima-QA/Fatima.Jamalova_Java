import java.util.Locale;
import java.util.Scanner;

public class Task6_Tapsirig8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale (Locale.US);

        System.out.println("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        double biletQiymeti;
        if (yas <= 7) {
            biletQiymeti = 0;
        } else if (yas <= 17) {
            biletQiymeti = 3;
        } else if (yas <= 64) {
            biletQiymeti = 7;
        } else {
            biletQiymeti = 4;
        }

        System.out.println("Bir bilet üçün ödəniləcək məbləğ: " + biletQiymeti + " AZN");

        System.out.print("Neçə bilet alırsınız? ");
        int biletSayi = scanner.nextInt();

        double umumiMebleg = biletQiymeti * biletSayi;

        System.out.println("Ümumi ödəniləcək məbləğ: " + umumiMebleg + " AZN");

        scanner.close();







    }
}
