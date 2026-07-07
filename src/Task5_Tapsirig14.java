import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən ay nömrəsi (1-12) alır,
// switch fall-through istifadə edərək hansı maliyyə rübünə aid olduğunu çap edir.
public class Task5_Tapsirig14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ayNomresi = scanner.nextInt();

        switch (ayNomresi) {
            case 1:
            case 2:
            case 3:
                System.out.println("I rüb");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("II rüb");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("III rüb");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("IV rüb");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi");
        }

        scanner.close();
    }
}