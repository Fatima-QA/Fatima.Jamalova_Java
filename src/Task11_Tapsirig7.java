import java.util.HashMap;
import java.util.Scanner;


public class Task11_Tapsirig7 {
    public static void main (String[] args){

        HashMap<String, String> musteriler = new HashMap<>();

        musteriler.put("C001", "Fatimə Camalova");
        musteriler.put("C002", "Rəşad Əliyev");
        musteriler.put("C003", "Əminə Əhmədova");
        musteriler.put("C004", "Nərmin Quliyeva");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = scanner.nextLine();

        // Kodun bazada olub-olmadığını yoxlamaq
        if (musteriler.containsKey(kod)) {
            String ad = musteriler.get(kod);
            System.out.println("Müştərinin adı: " + ad);
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }

        scanner.close();
    }
}
