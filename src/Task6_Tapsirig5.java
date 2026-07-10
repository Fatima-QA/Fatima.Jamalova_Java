import java.util.Scanner;
import java.util.Locale;

// Bu proqram ilkin əmanət məbləği və illik faiz dərəcəsini alır,
// məbləğ ilkin dəyərin iki qatına çatana qədər hər ilin sonunda balansı çap edir
// və bunun üçün neçə il lazım olduğunu tapır.
public class Task6_Tapsirig5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("İlkin əmanət məbləğini daxil edin: ");
        double ilkinMebleg = scanner.nextDouble();

        System.out.print("İllik faiz dərəcəsini daxil edin (məs: 5 üçün 5% yaz): ");
        double faizDerecesi = scanner.nextDouble();

        double hedefMebleg = ilkinMebleg * 2;
        double cariMebleg = ilkinMebleg;
        int il = 0;

        // Neçə il çəkəcəyi əvvəlcədən bilinmədiyi üçün while dövrü istifadə olunur
        while (cariMebleg < hedefMebleg) {
            cariMebleg = cariMebleg + (cariMebleg * faizDerecesi / 100);
            il++;
            System.out.println(il + "-ci il: " + cariMebleg);
        }

        System.out.println("Məbləğ " + il + " ildə iki qatına çatdı.");

        scanner.close();
    }
}