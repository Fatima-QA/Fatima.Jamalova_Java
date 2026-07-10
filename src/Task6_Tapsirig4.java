import java.util.Scanner;
import java.util.Locale;

// Bu proqram 5 oyunçunun qol sayını ardıcıl olaraq for dövrü ilə alır,
// ən çox qol vuran oyunçunun nömrəsini və qol sayını tapıb çap edir.
public class Task6_Tapsirig4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int oyunçuSayi = 5;
        int enCoxQol = -1;
        int enYaxsiOyunçu = -1;

        // Oyunçu sayı əvvəlcədən məlum olduğu üçün (5 nəfər) for dövrü istifadə olunur
        for (int i = 1; i <= oyunçuSayi; i++) {
            System.out.print(i + "-ci oyunçunun qol sayını daxil edin: ");
            int qol = scanner.nextInt();

            if (qol > enCoxQol) {
                enCoxQol = qol;
                enYaxsiOyunçu = i;
            }
        }

        System.out.println("Ən yaxşı nəticə: Oyunçu #" + enYaxsiOyunçu + " — " + enCoxQol + " qol");

        scanner.close();
    }
}