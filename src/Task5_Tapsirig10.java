import java.util.Scanner;
import java.util.Locale;

// Bu proqram bank menyusunu çap edir, istifadəçidən seçim (1-4) alır
// və switch ilə seçimə uyğun mesajı çap edir.
public class Task5_Tapsirig10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Menyunu çap etmək
        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");
        System.out.print("Seçiminizi daxil edin (1-4): ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Balansınız: 1250 AZN");
                break;
            case 2:
                System.out.println("Pul yatırma əməliyyatı uğurla tamamlandı");
                break;
            case 3:
                System.out.println("Pul çıxarma əməliyyatı uğurla tamamlandı");
                break;
            case 4:
                System.out.println("Çıxış edilir...");
                break;
            default:
                System.out.println("Yanlış seçim");
        }

        scanner.close();
    }
}
