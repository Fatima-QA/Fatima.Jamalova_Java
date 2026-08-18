import java.util.ArrayList;

public class Task11_Tapsirig6 {

    public static void main(String[] args){

        ArrayList<Integer> emeliyyatlar = new ArrayList<>();
        emeliyyatlar.add(150);
        emeliyyatlar.add(300);
        emeliyyatlar.add(100);
        emeliyyatlar.add(230);
        emeliyyatlar.add(568);

        System.out.println("Əməliyyatlar: " + emeliyyatlar);

        int cem = 0;
        for (int meblegh : emeliyyatlar) { // for each dövrü ilə ümumi cəmin hesablanması
            cem += meblegh;
        }
        System.out.println("Günün ümumi əməliyyat cəmi: " + cem);

        // İş günü bağlanır - siyahı tam təmizlənir
        emeliyyatlar.clear();

        // Siyahının boş olub-olmadığını yoxlamaq
        boolean bosdurmu = emeliyyatlar.isEmpty();
        System.out.println("Siyahı təmizləndikdən sonra boşdurmu? " + bosdurmu);
        System.out.println("Siyahının hazırkı vəziyyəti: " + emeliyyatlar);
    }
}
