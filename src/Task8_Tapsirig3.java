import java.util.Locale;
import java.util.Scanner;

public class Task8_Tapsirig3 {
    public static void main(String[] args){

        System.out.println("-------- Müsbət ədəd yoxlaması ---------");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int reqem;

        do{
            System.out.println("Ədədi daxil edin: "); // Scanner ilə istifadəçidən ədəd al
            reqem = scanner.nextInt();

            if (reqem <=0) { // ədəd 0-dan kiçikdirsə, yenidən daxil et
                System.out.println("Yenidən daxil edin: ");
            }
        } while (reqem <= 0); // ədəd 0-dan kiçik olana qədər davam et
        System.out.println("Qəbul edildi: " + reqem);

        scanner.close();
    }
}
