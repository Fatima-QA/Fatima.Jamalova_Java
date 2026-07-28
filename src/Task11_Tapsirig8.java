import java.util.HashMap;
import java.util.Map;

public class Task11_Tapsirig8 {
    public static void main(String[] args) {
        HashMap<String, Integer> filiallar = new HashMap<>();
        filiallar.put("Nərimanov", 120);
        filiallar.put("Yasamal filialı", 95);
        filiallar.put("Sumqayıt filialı", 60);
        filiallar.put("Xankəndi filialı", 40);

        System.out.println("Filialların sayı: "+ filiallar.size());
        // Dövr ilə hər cütü "filial -> say" formatında çap etmək
        System.out.println("\nFilial hesabatı:");
        for (Map.Entry<String, Integer> cut : filiallar.entrySet()) {
            System.out.println(cut.getKey() + " -> " + cut.getValue());
        }

        // Bir filial bağlanır - bazadan silinir
        filiallar.remove("Sumqayıt filialı");

        // Dəyişiklikdən sonra yenidən cüt sayını çap etmək
        System.out.println("\nSumqayıt filialı bağlandıqdan sonra:");
        System.out.println("Filialların sayı: " + filiallar.size());

        System.out.println("\nYenilənmiş filial hesabatı:");
        for (Map.Entry<String, Integer> cut : filiallar.entrySet()) {
            System.out.println(cut.getKey() + " -> " + cut.getValue());
        }
    }
}
