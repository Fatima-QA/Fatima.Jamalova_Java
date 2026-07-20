//Inheritance prinsipi
// Ata sinif Hesab-da ümumi sahələr (sahibinAdi, balans) və mədaxil metodu var,
// EmanetHesabi sinfi ondan miras alır və illik faizi hesablayıb balansa əlavə edən metod əlavə edir.
public class Task9_Tapsirig4 {

    // Ata sinif
    static class Hesab {
        private String sahibinAdi;
        private double balans;

        public Hesab(String sahibinAdi, double balans) {
            this.sahibinAdi = sahibinAdi;
            this.balans = balans;
        }

        public String getSahibinAdi() {
            return sahibinAdi;
        }

        public double getBalans() {
            return balans;
        }

        // Balansı artıran ümumi metod (mədaxil)
        public void medaxilEt(double mebleg) {
            balans = balans + mebleg;
        }
    }

    // EmanetHesabi sinfi Hesab-dan miras alır
    static class EmanetHesabi extends Hesab {
        private double illikFaizDerecesi;

        public EmanetHesabi(String sahibinAdi, double balans, double illikFaizDerecesi) {
            super(sahibinAdi, balans);
            this.illikFaizDerecesi = illikFaizDerecesi;
        }

        // Faizi hesablayıb balansa əlavə edən metod (EmanetHesabi-a xasdır)
        public void faiziTetbiqEt() {
            double faizMebleği = getBalans() * illikFaizDerecesi / 100;
            medaxilEt(faizMebleği);
        }
    }

    public static void main(String[] args) {
        EmanetHesabi hesab = new EmanetHesabi("Rüfət", 5000, 5);

        System.out.println("İlkin balans: " + hesab.getBalans());

        // Mədaxil (miras alınmış metod)
        hesab.medaxilEt(1000);
        System.out.println("Mədaxildən sonra balans: " + hesab.getBalans());

        // Faizin tətbiqi (öz metodu)
        hesab.faiziTetbiqEt();
        System.out.println("Sahib: " + hesab.getSahibinAdi() + ", Son balans: " + hesab.getBalans());
    }
}