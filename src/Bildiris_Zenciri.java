// Bu proqram çoxsəviyyəli (multilevel) inheritance və super.metod() çağırışını nümayiş etdirir:
// Bildiris ata class-ında gonder() var, EmailBildiris onu override edib
// super.gonder() ilə ata versiyasını çağırır, sonra öz əlavəsini edir.
// TeciliEmailBildiris isə EmailBildiris-dən miras alıb eyni məntiqi bir addım da genişləndirir.
public class Bildiris_Zenciri {

    static class Bildiris {
        public void gonder() {
            System.out.println("Bildiriş göndərilir...");
        }
    }

    static class EmailBildiris extends Bildiris {
        @Override
        public void gonder() {
            super.gonder();
            System.out.println("Email vasitəsilə göndərildi.");
        }
    }

    static class TeciliEmailBildiris extends EmailBildiris {
        @Override
        public void gonder() {
            super.gonder();
            System.out.println("Təcili email kimi işarələndi!");
        }
    }
}