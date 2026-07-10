import java.util.Scanner;
import java.util.Locale;

// Bu proqram istifadəçidən mobil nömrənin kod hissəsini (050, 051, 055, 070, 077, 099) alır
// və uyğun operatoru (Bakcell, Azercell, Nar) çap edir.
    public class Task6_Tapsirig6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Mobil nömrənin kod hissəsini daxil edin (məs: 055): ");
        String kod = scanner.next();

        switch (kod) {
            case "050":
            case "051":
                System.out.println("Azercell");
                break;
            case "055":
            case "099":
                System.out.println("Bakcell");
                break;
            case "070":
            case "077":
                System.out.println("Nar");
                break;
            default:
                System.out.println("Naməlum operator");
        }

        scanner.close();
    }
}