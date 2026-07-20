// Polymorphism (Method Overriding) prinsipi
// Ata sinif Bildiris-də mesajGonder metodu var, üç varis sinif (EmailBildiris, SmsBildiris, PushBildiris)
// bu metodu öz kanalına uyğun yenidən yazır (override edir).
public class Task9_Tapsirig6 {

    // Ata sinif
    static class Bildiris {
        public void mesajGonder(String mesaj) {
            System.out.println("Bildiriş göndərilir: " + mesaj);
        }
    }

    // EmailBildiris sinfi mesajGonder metodunu yenidən yazır
    static class EmailBildiris extends Bildiris {
        @Override
        public void mesajGonder(String mesaj) {
            System.out.println("Email vasitəsilə göndərildi: " + mesaj);
        }
    }

    // SmsBildiris sinfi mesajGonder metodunu yenidən yazır
    static class SmsBildiris extends Bildiris {
        @Override
        public void mesajGonder(String mesaj) {
            System.out.println("SMS vasitəsilə göndərildi: " + mesaj);
        }
    }

    // PushBildiris sinfi mesajGonder metodunu yenidən yazır
    static class PushBildiris extends Bildiris {
        @Override
        public void mesajGonder(String mesaj) {
            System.out.println("Push bildiriş vasitəsilə göndərildi: " + mesaj);
        }
    }

    public static void main(String[] args) {
        // Ata tipli massivdə üç fərqli varis obyekti saxlanılır
        Bildiris[] bildirisler = new Bildiris[3];
        bildirisler[0] = new EmailBildiris();
        bildirisler[1] = new SmsBildiris();
        bildirisler[2] = new PushBildiris();

        // for-each dövrü ilə hamısına eyni mesaj göndərilir
        for (Bildiris bildiris : bildirisler) {
            bildiris.mesajGonder("Sizin sifarişiniz təsdiqləndi!");
        }
    }
}
