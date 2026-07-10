import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən 1-100 arası bal alır,
// balı hərfi qiymətə çevirir və "Bal: X → Qiymət: Y" formatında çap edir.
public class Task6_Tapsirig1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Balı daxil edin(1-100): ");
        int bal = scanner.nextInt();
        String qiymet;
        if (bal > 90){
            qiymet = "Əla";
        } else if (bal >= 70) {
            qiymet = "Yaxşı";
        } else if (bal >= 50) {
            qiymet = "Kafi";
        } else {
            qiymet = "Qeyri-kafi";
        }

        System.out.println("Bal: " + bal + " → Qiymət: " + qiymet);

        scanner.close();
    }
}

