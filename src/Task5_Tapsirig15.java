import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən parol (String) alır,
// uzunluğuna görə parolun gücünü (Zəif, Orta, Güclü) çap edir.
// Parol boşdursa ayrıca xəbərdarlıq verir.
public class Task5_Tapsirig15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Parolunuzu daxil edin: ");
        String parol = scanner.nextLine();

        int uzunluq = parol.length();

        // Bonus: parol boşdursa
        if (uzunluq == 0) {
            System.out.println("Parol boş ola bilməz");
        } else if (uzunluq < 6) {
            System.out.println("Zəif");
        } else if (uzunluq <= 9) {
            System.out.println("Orta");
        } else {
            System.out.println("Güclü");
        }

        scanner.close();
    }
}
