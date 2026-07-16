import java.util.Scanner;
import java.util.Locale;

public class Task8_Tapsirig4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int reqem;
        int cem = 0;

        do {
            System.out.println("Ədəd daxil edin (Bitirmək üçün 0): "); // Bütün şərtlərdə ilk ədəd soruşulur
                                                                       // 0 daxil edilənə qədər proqram davam edir
            reqem = scanner.nextInt();

            if (reqem !=0){
                cem = cem + reqem; // əgər 0 daxil edilibsə, hər sonrakı ədədi cəmlə topla
            }
        } while (reqem !=0); // 0 daxil edilənənə qədər davam et
        System.out.println("Cəm: " + cem);

    }
}
