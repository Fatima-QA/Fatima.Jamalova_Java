import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən çəki (kq) və boy (metrlə) alır,
// BMI-ni hesablayıb, nəticəyə görə kateqoriyanı çap edir.
public class Task5_Tapsirig13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Çəkinizi daxil edin (kq): ");
        double çeki = scanner.nextDouble();

        System.out.print("Boyunuzu daxil edin (metrlə): ");
        double boy = scanner.nextDouble();

        double bmi = çeki / (boy * boy);

        System.out.println("BMI dəyəriniz: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Arıq");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 29.9) {
            System.out.println("Artıq çəkili");
        } else {
            System.out.println("Piylənmə");
        }

        scanner.close();
    }
}
