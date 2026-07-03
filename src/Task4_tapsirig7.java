import java.util.Scanner;
import java.util.Locale;

public class Task4_tapsirig7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Bir double dəyər daxil et (məs: -4.7): ");
        double value = scanner.nextDouble();

        // (int) casting
        int castResult = (int) value;

        // Math.round()
        long roundResult = Math.round(value);

        System.out.println("\n--- Nəticələr ---");
        System.out.println("Original dəyər: " + value);
        System.out.println("(int) casting: " + castResult);
        System.out.println("Math.round(): " + roundResult);

        System.out.println("\nİZAH:");
        System.out.println("(int) casting ondalıq hissəni kəsir.");
        System.out.println("Math.round() isə ən yaxın tam ədədə yuvarlayır.");
        System.out.println("Mənfi ədədlərdə fərq daha aydın görünür.");
    }
}