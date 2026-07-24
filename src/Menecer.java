// Bu proqram Inheritance prinsipini nümayiş etdirir:
// Ata sinif İşçi-də ad konstruktor vasitəsilə təyin olunur,
// Menecer sinfi ondan miras alır və əlavə olaraq komandaSayi xüsusiyyətinə malikdir.
// Menecer sinfi Isci-dən miras alır
public class Menecer extends Main.Isci {
    private int komandaSayi;

    public Menecer(String ad, int komandaSayi) {
        super(ad);
        this.komandaSayi = komandaSayi;
    }

    public int getKomandaSayi() {
        return komandaSayi;
    }
}
