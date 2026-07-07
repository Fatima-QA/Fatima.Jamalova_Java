import java.util.Scanner;
import java.util.Locale;


public class Task5_Tapsirig3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("İmtahan balını daxil edin (0-100): ");
        int bal = scanner.nextInt();

        // Bal aralığına görə qiymətləndirmə
        if (bal > 100 || bal < 0) {
            System.out.println("Yanlış bal!");
        } else if (bal >= 90) {
            System.out.println("Əla (5)");
        } else if (bal >= 80) {
            System.out.println("Çox yaxşı (4)");
        } else if (bal >= 70) {
            System.out.println("Yaxşı (3)");
        } else if (bal >= 60) {
            System.out.println("Kafi (2)");
        } else {
            System.out.println("Qeyri-kafi (1)");
        }

        scanner.close();
    }
}