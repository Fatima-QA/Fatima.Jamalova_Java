import java.util.Scanner;
import java.util.Locale;

public class Task5_Tapsirig7 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Bu proqram istifadəçidən yaş, aylıq gəlir və kredit məbləğini alır,
        // hər şərti ayrıca yoxlayıb, pozulan şərtləri çap edir.
        // Bütün şərtlər ödənilirsə "TƏSDİQ EDİLDİ" çap olunur.

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        System.out.print("Aylıq gəlirinizi daxil edin: ");
        double gelir = scanner.nextDouble();

        System.out.print("Kredit məbləğini daxil edin: ");
        double mebleg = scanner.nextDouble();

        boolean hamisiUygundur = true;

        // Yaş şərti
        if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil");
            hamisiUygundur = false;
        }

        // Gəlir şərti
        if (gelir <= 800) {
            System.out.println("Rədd edildi: gəlir uyğun deyil");
            hamisiUygundur = false;
        }

        // Məbləğ şərti
        if (mebleg < 300 || mebleg > 50000) {
            System.out.println("Rədd edildi: məbləğ uyğun deyil");
            hamisiUygundur = false;
        }

        if (hamisiUygundur) {
            System.out.println("TƏSDİQ EDİLDİ");
        }

        scanner.close();
    }
}
