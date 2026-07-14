import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən uçuş kodunun ilk 2 hərfini (məs: AZ) alır,
// switch ilə uyğun aviaşirkət adını çap edir.
public class Task7_Tapsirig6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Uçuş kodunun ilk 2 hərfini daxil edin (məs: AZ): ");
        String kod = scanner.next();

        switch (kod) {
            case "AZ":
                System.out.println("Azerbaijan Airlines");
                break;
            case "TK":
                System.out.println("Turkish Airlines");
                break;
            case "QR":
                System.out.println("Qatar Airways");
                break;
            default:
                System.out.println("Naməlum aviaşirkət");
        }

        scanner.close();
    }
}