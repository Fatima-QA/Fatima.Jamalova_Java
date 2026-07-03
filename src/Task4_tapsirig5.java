import java.util.Scanner;
import java.util.Locale;

public class Task4_tapsirig5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Bir int dəyər daxil edin: ");
        int intEded = scanner.nextInt();

        double doubleEded = intEded;

        System.out.println("Widening nəticəsi: " + doubleEded);

        System.out.print("Bir double dəyər daxil edin: ");
        double daxilEdilenDouble = scanner.nextDouble();

        int tamEded = (int) daxilEdilenDouble;

        System.out.println("Narrowing nəticəsi: " + tamEded);

        // (int) casting ondalıq hissəni yuvarlamır, ancaq kəsir
    }
}
