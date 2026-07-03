import java.util.Scanner;
import java.util.Locale;

public class Task4_tapsirig6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ədədi String kimi daxil et (məs: 245): ");
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);

        int result = number + 10;

        System.out.println("Riyazi nəticə (int): " + result);

        String resultString = String.valueOf(result);

        int length = resultString.length();

        System.out.println("String forması: " + resultString);
        System.out.println("Uzunluq: " + length);
    }
}