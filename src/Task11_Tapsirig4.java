class LimitKeçildiException extends Exception{
    public LimitKeçildiException(String mesaj){
        super(mesaj);
    }

}


public class Task11_Tapsirig4 {
    static final double GUNLUK_LIMIT = 2000;
    public static void nagdCixar(double meblegh) throws LimitKeçildiException {
        if (meblegh > GUNLUK_LIMIT){
            throw new LimitKeçildiException("Gündəlik limit aşıldı! Limit: " + GUNLUK_LIMIT);
        }
        System.out.println("Nağd çıxarıldı: " + meblegh + "AZN");
    }

    public static void main(String[] args) {
        try {
            nagdCixar(500);
        } catch (LimitKeçildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            nagdCixar(3000);
        } catch (LimitKeçildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

    }
}
