import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən üç tərəf uzunluğu alır,
// əvvəlcə üçbucağın mümkün olub-olmadığını yoxlayır,
// mümkündürsə növünü (bərabərtərəfli, bərabəryanlı, müxtəliftərəfli) müəyyən edir.
public class Task5_Tapsirig8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Birinci tərəfi (a) daxil edin: ");
        double terefA = scanner.nextDouble();

        System.out.print("İkinci tərəfi (b) daxil edin: ");
        double terefB = scanner.nextDouble();

        System.out.print("Üçüncü tərəfi (c) daxil edin: ");
        double terefC = scanner.nextDouble();

        // Üçbucağın mümkünlüyünü yoxlamaq: bir tərəf digər ikisinin cəmindən kiçik olmalıdır
        boolean ucbucaqMumkundur = (terefA < terefB + terefC) &&
                (terefB < terefA + terefC) &&
                (terefC < terefA + terefB);

        if (!ucbucaqMumkundur) {
            System.out.println("Belə üçbucaq mövcud deyil");
        } else if (terefA == terefB && terefB == terefC) {
            System.out.println("Bərabərtərəfli");
        } else if (terefA == terefB || terefB == terefC || terefA == terefC) {
            System.out.println("Bərabəryanlı");
        } else {
            System.out.println("Müxtəliftərəfli");
        }

        scanner.close();
    }
}
