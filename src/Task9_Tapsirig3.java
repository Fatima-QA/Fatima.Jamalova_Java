// Inheritance (varislik) prinsipi
// Ata sinif Isci-də ümumi sahə (ad) və metod (özünü təqdim etmək) var,
// Menecer və Developer sinifləri ondan miras alır və özünə uyğun metod əlavə edir.
public class Task9_Tapsirig3 {

    // Ata sinif
    static class Isci {
        private String ad;

        public Isci(String ad) {
            this.ad = ad;
        }

        public String getAd() {
            return ad;
        }

        // Ümumi metod: bütün işçilər özünü təqdim edə bilər
        public void ozunuTeqdimEt() {
            System.out.println("Salam, mənim adım " + ad + ".");
        }
    }

    // Menecer sinfi Isci-dən miras alır
    static class Menecer extends Isci {
        public Menecer(String ad) {
            super(ad);
        }

        // Menecerə xas metod
        public void komandaniIdareEt() {
            System.out.println(getAd() + " komandanı idarə edir.");
        }
    }

    // Developer sinfi Isci-dən miras alır
    static class Developer extends Isci {
        public Developer(String ad) {
            super(ad);
        }

        // Developerə xas metod
        public void koduYaz() {
            System.out.println(getAd() + " kod yazır.");
        }
    }
     // Main
    public static void main(String[] args) {
        Menecer menecer = new Menecer("Yunis");
        Developer developer = new Developer("Fatimə");

        // Miras alınmış metod
        menecer.ozunuTeqdimEt();
        // Öz metodu
        menecer.komandaniIdareEt();

        // Miras alınmış metod
        developer.ozunuTeqdimEt();
        // Öz metodu
        developer.koduYaz();
    }
}
