import java.util.Scanner;
import java.util.Locale;

public class Task5_Tapsirig9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ayNomresi = scanner.nextInt();

        switch (ayNomresi) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi");
        }

        scanner.close();
    }
}


