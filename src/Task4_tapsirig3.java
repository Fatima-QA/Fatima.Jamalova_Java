import java.util.Scanner;

public class Task4_tapsirig3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("3 rəqəmli ədəd daxil et: ");
        int sayi = scanner.nextInt();

        // rəqəmləri ayırmaq
        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        // cəm
        int cem = yuzler + onlar + birler;

        System.out.println("Yüzlər: " + yuzler);
        System.out.println("Onlar: " + onlar);
        System.out.println("Birlər: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + cem);
    }
}