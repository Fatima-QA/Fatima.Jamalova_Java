import java.util.Scanner;
import java.util.Locale;

public class Task4_tapsirig2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Kredit məbləği: ");
        double mebleg = sc.nextDouble();

        System.out.print("İllik faiz (%): ");
        double faiz = sc.nextDouble();

        System.out.print("Müddət (ay): ");
        int muddet = sc.nextInt();

        // hesablamalar
        double umumiFaiz = mebleg * (faiz / 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        // nəticə
        System.out.println("\n--- Kredit Hesabatı ---");
        System.out.println("Kredit məbləği: " + mebleg);
        System.out.println("İllik faiz: " + faiz + "%");
        System.out.println("Müddət: " + muddet + " ay");

        System.out.println("Ümumi faiz: " + umumiFaiz);
        System.out.println("Ümumi ödəniş: " + umumiOdenis);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);
    }
}
