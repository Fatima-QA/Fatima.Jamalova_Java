import java.util.Scanner;
import java.util.Locale;

// Bu proqram vahid çevirici menyusunu göstərir, istifadəçi seçim edir,
// 0-dan fərqli seçimdə 1 ədəd daxil edilir, uyğun düsturla nəticə çap olunur.
// İstifadəçi 0 seçənə qədər (sayı əvvəlcədən bilinmədiyi üçün) while dövrü ilə davam edir.
public class Task7_Tapsirig9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int secim = -1;

        while (secim != 0) {
            System.out.println("\n1) Metr → Fut");
            System.out.println("2) Kiloqram → Funt");
            System.out.println("3) Selsi → Fahrenheit");
            System.out.println("0) Çıxış");
            System.out.print("Seçiminizi daxil edin: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 0:
                    System.out.println("Çıxış edildi");
                    break;
                case 1:
                    System.out.print("Metr dəyərini daxil edin: ");
                    double metr = scanner.nextDouble();
                    double fut = metr * 3.28084;
                    System.out.println("Nəticə: " + fut);
                    break;
                case 2:
                    System.out.print("Kiloqram dəyərini daxil edin: ");
                    double kiloqram = scanner.nextDouble();
                    double funt = kiloqram * 2.20462;
                    System.out.println("Nəticə: " + funt);
                    break;
                case 3:
                    System.out.print("Selsi dəyərini daxil edin: ");
                    double selsi = scanner.nextDouble();
                    double fahrenheit = selsi * 9 / 5 + 32;
                    System.out.println("Nəticə: " + fahrenheit);
                    break;
                default:
                    System.out.println("Yanlış seçim!");
            }
        }

        scanner.close();
    }
}