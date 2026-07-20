// Abstraction (mürəkkəbliyi gizlətmək) prinsipi
// KofeMasini sinfində istifadəçiyə yalnız "kofeHazirla" metodu açıqdır,
// arxadakı addımlar (su qızdırmaq, kofe tökmək, fincanı doldurmaq) private olub kənardan çağırıla bilmir.
public class Task9_Tapsirig7 {

    static class KofeMasini {

        // private metodlar: yalnız sinifin öz daxilində çağırıla bilər, kənardan gizlidir
        private void suQizdir() {
            System.out.println("Su qızdırılır...");
        }

        private void kofeTok() {
            System.out.println("Kofe tökülür...");
        }

        private void fincaniDoldur() {
            System.out.println("Fincan doldurulur...");
        }

        // public metod: istifadəçinin görəcəyi yeganə metod (sadə interfeys)
        public void kofeHazirla() {
            suQizdir();
            kofeTok();
            fincaniDoldur();
            System.out.println("Kofeniz hazırdır!");
        }
    }

    public static void main(String[] args) {
        KofeMasini kofeMasini = new KofeMasini();

        // İstifadəçi yalnız bir metodu çağırır, mürəkkəb daxili proses ondan gizlidir
        kofeMasini.kofeHazirla();
    }
}
