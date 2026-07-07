import java.util.Scanner;
import java.util.Locale;

public class Task5_Tapsirig5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Gün nömrəsini daxil edin (1-7): ");
        int gunNomresi = scanner.nextInt();

        switch (gunNomresi) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
            case 7:
                System.out.println("Bazar");
                System.out.println("Həftə sonu!");
                break;
            default:
                System.out.println("Yanlış gün nömrəsi");
        }

        scanner.close();
    }
}
