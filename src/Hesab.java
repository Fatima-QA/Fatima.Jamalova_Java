abstract class Hesab {
    // Adi metod: tam gövdəsi var, bütün varislər eyni işi görür
    public void balansGoster() {
        System.out.println("Balans göstərilir...");
    }

    // Abstract metod: gövdəsi yoxdur, hər varis özü tamamlamalıdır
    public abstract void faizHesabla();
}

class Depozit extends Hesab {
    @Override
    public void faizHesabla() {
        System.out.println("Depozit üçün faiz hesablanır: illik 7% əlavə olunur.");
    }
}

class Kredit extends Hesab {
    @Override
    public void faizHesabla() {
        System.out.println("Kredit üçün faiz hesablanır: aylıq 2% tətbiq olunur.");
    }
}