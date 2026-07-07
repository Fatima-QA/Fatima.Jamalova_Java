import java.util.Scanner;


public class Task5_Tapsirig2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci ədədi daxil edin: ");
        int birinci = scanner.nextInt();

        System.out.println("İkinci ədədi daxil edin: ");
        int ikinci = scanner.nextInt();

        System.out.println("Üçüncü ədədi daxil edin: ");
        int üçüncü = scanner.nextInt();


        // Ən böyük ədədi tapmaq
        int enBoyuk;
        if (birinci >= ikinci && birinci >= üçüncü) {
            enBoyuk = birinci;
        } else if (ikinci >= birinci && ikinci >= üçüncü) {
            enBoyuk = ikinci;
        } else {
            enBoyuk = üçüncü;
        }

        //Ən kiçik ədədi tapmaq
        int enKicik;
        if (birinci <= ikinci && birinci <= üçüncü) {
            enKicik = birinci;
        } else if (ikinci <= birinci && ikinci <= üçüncü) {
            enKicik = ikinci;
        } else {
            enKicik = üçüncü;
        }

        System.out.println("Ən böyük: " + enBoyuk);
        System.out.println("Ən kiçik: " + enKicik);

        scanner.close();



    }
}