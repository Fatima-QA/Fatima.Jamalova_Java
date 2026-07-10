import java.util.Scanner;
import java.util.Locale;

 public class Task6_Tapsirig7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int gizli = 42;
        int cehdSayi = 0;
        boolean tapilmayib = true;

        while (tapilmayib) {
            System.out.println("Ədədi daxil edin: ");
            int tahmin = scanner.nextInt();
            cehdSayi++;

            if(tahmin<gizli){
                System.out.println("Kiçikdir");
            }else if (tahmin>gizli) {
                System.out.println("Böyükdür");
            } else {
                System.out.println("Tapdın!");
                tapilmayib = false;
            }
        }

        System.out.println("Cəmi cəhd sayı: " + cehdSayi);
      scanner.close();
    }
 }
