import java.util.Scanner;
import java.util.Locale;


 public class Task5_Tapsirig6 {
public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

    System.out.print("Birinci ədədi daxil edin: ");
    double birinciEded = scanner.nextDouble();

    System.out.print("İkinci ədədi daxil edin: ");
    double ikinciEded = scanner.nextDouble();

    System.out.print("Əməliyyat işarəsini daxil edin (+ - * /): ");
    String emeliyyat = scanner.next();

    switch (emeliyyat) {
        case "+":
            System.out.println("Nəticə: " + (birinciEded + ikinciEded));
            break;
        case "-":
            System.out.println("Nəticə: " + (birinciEded - ikinciEded));
            break;
        case "*":
            System.out.println("Nəticə: " + (birinciEded * ikinciEded));
            break;
        case "/":
            if (ikinciEded == 0) {
                System.out.println("0-a bölmək olmaz!");
            } else {
                System.out.println("Nəticə: " + (birinciEded / ikinciEded));
            }
            break;
        default:
            System.out.println("Naməlum əməliyyat işarəsi!");
    }

    scanner.close();
}
 }
