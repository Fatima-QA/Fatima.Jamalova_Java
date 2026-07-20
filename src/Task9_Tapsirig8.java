// Abstraction prinsipi
// Bankomat sinfində balans private saxlanılır, istifadəçiyə yalnız "pulCek" metodu açıqdır,
// yoxlama (balansın kifayət edib-etmədiyi) isə arxada gizli (private) metodda aparılır.
public class Task9_Tapsirig8 {


    static class Bankomat {
        private double balans;

        public Bankomat(double balans) {
            this.balans = balans;
        }

        // private metod: balansın kifayət edib-etmədiyini yoxlayır, kənardan çağırıla bilmir
        private boolean balansKifayetdirmi(double mebleg) {
            return balans >= mebleg;
        }

        // public metod: istifadəçinin görəcəyi yeganə metod
        public void pulCek(double mebleg) {
            if (balansKifayetdirmi(mebleg)) {
                balans = balans - mebleg;
                System.out.println("Çəkilən məbləğ: " + mebleg + " AZN, Qalıq: " + balans + " AZN");
            } else {
                System.out.println("İmtina: Balans kifayət etmir! Cari balans: " + balans + " AZN");
            }
        }
    }

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(800);

        // Uğursuz çəkim (balansdan çox məbləğ istənilir)
        bankomat.pulCek(1500);

        // Uğurlu çəkim
        bankomat.pulCek(300);
    }
}