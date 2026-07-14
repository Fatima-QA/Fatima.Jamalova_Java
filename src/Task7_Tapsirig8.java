import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən yaş alır, yaşa uyğun bilet qiymətini müəyyən edir,
// sonra bilet sayını soruşub ümumi ödəniləcək məbləği hesablayır.
public class Task7_Tapsirig8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        double biletQiymeti; // ondalıq ədəd ola bilər deyə double
        if (yas <= 6) {
            biletQiymeti = 0;
        } else if (yas <= 17) {
            biletQiymeti = 2;
        } else if (yas <= 60) {
            biletQiymeti = 5;
        } else {
            biletQiymeti = 3;
        }

        System.out.println("Bir bilet üçün ödəniləcək məbləğ: " + biletQiymeti + " AZN");

        System.out.print("Neçə bilet alırsınız? ");
        int biletSayi = scanner.nextInt();

        double umumiMebleg = biletQiymeti * biletSayi;

        System.out.println("Ümumi ödəniləcək məbləğ: " + umumiMebleg + " AZN");

        scanner.close();
    }
}
