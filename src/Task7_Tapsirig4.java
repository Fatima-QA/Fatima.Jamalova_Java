import java.util.Scanner;
import java.util.Locale;

// Bu proqram 3 qaçışçının vaxtını (saniyə) ardıcıl olaraq for dövrü ilə alır,
// ən az vaxt sərf edən (ən sürətli) qaçışçının nömrəsini və vaxtını tapıb çap edir.
public class Task7_Tapsirig4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int qacisciSayi = 3;
        double enAzVaxt = -1;
        int enSuretliQacisci = -1;

        // Qaçışçı sayı əvvəlcədən məlum olduğu üçün (3 nəfər) for dövrü istifadə olunur
        for (int i = 1; i <= qacisciSayi; i++) {
            System.out.print(i + "-ci qaçışçının vaxtı: ");
            double vaxt = scanner.nextDouble();

            if (enAzVaxt == -1 || vaxt < enAzVaxt) {
                enAzVaxt = vaxt;
                enSuretliQacisci = i;
            }
        }

        System.out.println("Ən sürətli qaçışçı: #" + enSuretliQacisci + " — " + enAzVaxt + " saniyə");

        scanner.close();
    }
}