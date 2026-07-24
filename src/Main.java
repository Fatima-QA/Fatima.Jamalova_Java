// Bu proqram Abstract class prinsipini nümayiş etdirir:
// Hesab abstract class-ında balansGoster() (tam gövdəli, adi metod) və
// faizHesabla() (gövdəsiz, abstract metod) var.
// Depozit və Kredit varisləri faizHesabla()-nı öz qaydasında tamamlayır.
public class Main {
    public static void main(String[] args) {
        Depozit depozit = new Depozit();
        Kredit kredit = new Kredit();

        depozit.balansGoster();
        depozit.faizHesabla();

        kredit.balansGoster();
        kredit.faizHesabla();

        // Aşağıdakı sətri açsan (comment-i sil), kompilyasiya xətası alacaqsan:
        // Hesab hesab = new Hesab(); // Xəta: Hesab is abstract; cannot be instantiated
    }
}