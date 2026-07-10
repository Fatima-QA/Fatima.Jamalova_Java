import java.util.Scanner;
import java.util.Locale;

// Bu proqram ilkin balansı alır, istifadəçidən ardıcıl əməliyyat məbləğlərini qəbul edir
// (0 yazılanda dayanır), hər əməliyyatdan sonra balansı yeniləyib çap edir
// Sayın əvvəlcədən bilinməməsi səbəbindən while dövrü istifadə olunur
public class Task6_Tapsirig3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("İlkin balansı daxil edin: ");
        double balans = scanner.nextDouble();

        System.out.println("Cari balans: " + balans);

        System.out.print("Əməliyyat məbləğini daxil edin (dayanmaq üçün 0): ");
        double emeliyyat = scanner.nextDouble();

        // İstifadəçi neçə əməliyyat daxil edəcəyi əvvəlcədən bilinmir, ona görə while istifadə olunur
        while (emeliyyat != 0) {
            balans = balans + emeliyyat;

            System.out.println("Yeni balans: " + balans);

            if (balans < 0) {
                System.out.println("Xəbərdarlıq: balans mənfiyə düşdü!");
            }

            System.out.print("Əməliyyat məbləğini daxil edin (dayanmaq üçün 0): ");
            emeliyyat = scanner.nextDouble();
        }

        System.out.println("Son balans: " + balans);

        scanner.close();
    }
}