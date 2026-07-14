import java.util.Scanner;
import java.util.Locale;

public class Task7_Tapsirig3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int stok = 200;

        System.out.print("Əməliyyat sayını daxil edin (dayanmaq üçün 0): ");
        int emeliyyat = scanner.nextInt();

        while (emeliyyat != 0) {
            stok = stok + emeliyyat;
            System.out.println("Yeni stok: " + stok);

            System.out.print("Əməliyyat sayını daxil edin (dayanmaq üçün 0): ");
            emeliyyat = scanner.nextInt();
        }

        System.out.println("Son stok: " + stok);

        scanner.close();
    }
}