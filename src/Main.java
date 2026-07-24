//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Ata sinif
    static class Isci {
        private String ad;

        public Isci(String ad) {
            this.ad = ad;
        }

        public String getAd() {
            return ad;
        }
    }

    public static void main(String[] args) {
        Menecer menecer = new Menecer("Elvin", 9);

        System.out.println("Ad: " + menecer.getAd());
        System.out.println("Komanda sayı: " + menecer.getKomandaSayi());
    }
}