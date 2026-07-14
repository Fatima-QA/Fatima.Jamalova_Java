import java.util.Scanner;
import java.util.Locale;

// Bu proqram 3 günün satış məbləğini ardıcıl olaraq for dövrü ilə alır,
// ümumi məbləği və orta günlük satışı hesablayır,
// orta satışa görə həftənin uğurlu olub-olmadığını çap edir.
public class Task7_Tapsirig2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int gunSayi = 3;
        double umumiMebleg = 0;

        // Gün sayı əvvəlcədən məlum olduğu üçün (3 gün) for dövrü istifadə olunur
        for (int i = 1; i <= gunSayi; i++) {
            System.out.print(i + "-ci günün satışı: ");
            double gunlukSatis = scanner.nextDouble();
            umumiMebleg = umumiMebleg + gunlukSatis;
        }

        double ortaSatis = umumiMebleg / gunSayi;

        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");
        System.out.println("Orta günlük satış: " + ortaSatis + " AZN");

        if (ortaSatis > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }

        scanner.close();
    }
}
