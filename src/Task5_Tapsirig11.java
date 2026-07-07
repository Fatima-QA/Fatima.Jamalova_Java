import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən bir hərf (char) alır,
// switch ilə hərfin sait (a, e, i, o, u) yoxsa samit olduğunu çap edir.
public class Task5_Tapsirig11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Bir hərf daxil edin: ");
        char herf = scanner.next().charAt(0);

        switch (herf) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Sait");
                break;
            default:
                System.out.println("Samit");
        }

        scanner.close();
    }
}
