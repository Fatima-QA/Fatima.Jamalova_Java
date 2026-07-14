import java.util.Scanner;
import java.util.Locale;

// Bu proqram seyfin gizli kodunu (275) saxlayır, istifadəçi düzgün tapana qədər
// təxmin etməyə davam edir; hər cəhddən sonra "Böyükdür", "Kiçikdir" və ya "Seyf açıldı!" çap edir,
// sonda neçə cəhd apardığını göstərir.
public class Task7_Tapsirig7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int gizliKod = 275;
        int cehdSayi = 0;
        boolean acilmayib = true; //seyf açılmadığı müddətdə true gəlir

        // İstifadəçinin neçə cəhddə tapacağı əvvəlcədən bilinmədiyi üçün while dövrü istifadə olunur
        while (acilmayib) {
            System.out.print("Kodu təxmin edin (1-999): ");
            int tehmin = scanner.nextInt();
            cehdSayi++; // cəhd sayı bir bir artacaq

            if (tehmin < gizliKod) {
                System.out.println("Kiçikdir");
            } else if (tehmin > gizliKod) {
                System.out.println("Böyükdür");
            } else {
                System.out.println("Seyf açıldı!");
                acilmayib = false;
            }
        }

        System.out.println("Cəmi cəhd sayı: " + cehdSayi);

        scanner.close();
    }
}
