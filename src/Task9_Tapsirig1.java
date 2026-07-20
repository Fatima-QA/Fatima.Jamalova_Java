// Encapsulation prinsipi
// Telefon sinfinin batareya faizi kənardan birbaşa dəyişdirilə bilmir,
// yalnız nəzarətli metod (setter) vasitəsilə təyin olunur və 0-100 aralığı yoxlanılır.


public class Task9_Tapsirig1 {

    // Telefon
    static class Telefon {
        // private sahə: kənardan birbaşa çıxış yoxdur
        private int bateriyaFaizi;
        // Setter: yalnız düzgün (0-100) dəyəri qəbul edir
        public void setBateriyaFaizi(int faiz) {
            if (faiz < 0 || faiz > 100) {
                System.out.println("Xəta: Batareya faizi 0-100 aralığında olmalıdır! Daxil edilən dəyər: " + faiz);
            } else {
                bateriyaFaizi = faiz;
            }
        }

        // Getter: faizi oxumaq üçün
        public int getBateriyaFaizi() {
            return bateriyaFaizi;
        }
    }

    public static void main(String[] args) {
        Telefon telefon = new Telefon();

        telefon.setBateriyaFaizi(67);
        System.out.println("Cari batareya faizi: " + telefon.getBateriyaFaizi());

        // Yanlış dəyərlərlə test (aralıqdan kənar)
        telefon.setBateriyaFaizi(180);
        telefon.setBateriyaFaizi(-67);

        // Yenidən düzgün dəyər
        telefon.setBateriyaFaizi(50);
        System.out.println("Son batareya faizi: " + telefon.getBateriyaFaizi());
    }
}

