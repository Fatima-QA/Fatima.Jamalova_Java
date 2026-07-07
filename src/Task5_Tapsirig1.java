import java.util.Scanner;
import java.util.Locale;
public class Task5_Tapsirig1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Bir tam ədəd daxil edin: ");
        int reqem = scanner.nextInt();

        // Cüt/tək yoxlaması
        if (reqem % 2 == 0) {
            System.out.println(reqem + " ədədi cütdür.");
        } else {
            System.out.println(reqem + " ədədi təkdir.");
        }

        // Müsbət/mənfi/sıfır yoxlaması
        if (reqem > 0) {
            System.out.println(reqem + " ədədi müsbətdir.");
        } else if (reqem < 0) {
            System.out.println(reqem + " ədədi mənfidir.");
        } else {
            System.out.println("Ədəd sıfırdır.");
        }

        scanner.close();
    }
}
