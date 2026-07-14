import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən dəfələrlə temperatur alır,
// hər dəfə statusu çap edir, istifadəçi -999 yazanda proqram dayanacaq.
public class Task7_Tapsirig1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Temperaturu daxil edin (°C) (çıxmaq üçün -999): ");
        double temperatur = scanner.nextDouble();

        // İstifadəçi -999 yazana qədər davam edir (sayı əvvəlcədən bilinmir, ona görə while işlədirik)
        while (temperatur != -999) {
            String status;
            if (temperatur > 25.0) {
                status = "İsti";
            } else if (temperatur >= 15.0) {
                status = "Mülayim";
            } else if (temperatur >= 0) {
                status = "Soyuq";
            } else {
                status = "Şaxta";
            }

            System.out.println("Temperatur: " + temperatur + "°C → Status: " + status);

            System.out.print("Temperaturu daxil edin (°C) (çıxmaq üçün -999): ");
            temperatur = scanner.nextInt();
        }

        System.out.println("Proqram bitdi.");

        scanner.close();
    }
}