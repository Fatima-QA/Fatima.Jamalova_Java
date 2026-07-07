import java.util.Scanner;
import java.util.Locale;

public class Task5_Tapsirig4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale (Locale.US);

        System.out.print("İl ədədini daxil edin: ");
        int il = scanner.nextInt();

        // Uyğun il qaydası: ya 4-ə bölünür və 100-ə bölünmür, ya da  400-ə bölünür
        boolean uygunİldir = (il % 4 == 0 && il % 100 != 0) || (il % 400 == 0);

        System.out.println(uygunİldir ? "Uyğun il" : "Uyğun deyil");

        scanner.close();
    }
}

