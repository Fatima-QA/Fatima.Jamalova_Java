import java.util.Scanner;
import java.util.Locale;
public class Task4_tapsirig9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Email daxil et: ");
        String email = scanner.nextLine();

        boolean hasAt = email.contains("@");

        boolean hasDot = email.contains(".");

        int atIndex = email.indexOf("@");
        boolean validAtPosition = atIndex >= 2;

        System.out.println("\n--- Yoxlama ---");
        System.out.println("@ var: " + hasAt);
        System.out.println(". var: " + hasDot);
        System.out.println("@-dən əvvəl 2+ simvol: " + validAtPosition);

        boolean isValid = hasAt && hasDot && validAtPosition;

        System.out.println("\nEmail ümumi nəticə: " + isValid);
    }
}