// Method Overloading (metodun yüklənməsi) prinsipi
// Kalkulyator sinfində eyni adlı "vur" metodu fərqli parametr növü/sayı ilə üç dəfə yazılıb.
public class Task9_Tapsirig5 {

    static class Kalkulyator {

        // 1-ci variant: iki tam ədəd
        public int vur(int birinciEded, int ikinciEded) {
            return birinciEded * ikinciEded;
        }

        // 2-ci variant: üç tam ədəd
        public int vur(int birinciEded, int ikinciEded, int ucuncuEded) {
            return birinciEded * ikinciEded * ucuncuEded;
        }

        // 3-cü variant: iki kəsr (double) ədəd
        public double vur(double birinciEded, double ikinciEded) {
            return birinciEded * ikinciEded;
        }
    }

    public static void main(String[] args) {
        Kalkulyator kalkulyator = new Kalkulyator();

        int neticeIki = kalkulyator.vur(7, 8);
        System.out.println("İki tam ədədin hasili: " + neticeIki);

        int neticeUc = kalkulyator.vur(2, 3, 4);
        System.out.println("Üç tam ədədin hasili: " + neticeUc);

        double neticeKesr = kalkulyator.vur(2.8, 3.3);
        System.out.println("İki kəsr ədədin hasili: " + neticeKesr);
    }
}