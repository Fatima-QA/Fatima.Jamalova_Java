// Encapculation prinsipi
// Telebe sinfində ad və bal private saxlanılır, bal yalnız 0-100 aralığında qəbul edilir,
// balı oxuyan hissə hərfi qiyməti də hesablayıb qaytarır.


public class Task9_Tapsirig2 {

    static class Telebe {
        // private sahələr: kənardan birbaşa çıxış yoxdur
        private String ad;
        private int bal;

        // Ad üçün setter (sadə, validasiya tələb olunmur)
        public void setAd(String ad) {
            this.ad = ad;
        }

        // Ad üçün getter
        public String getAd() {
            return ad;
        }

        // Bal üçün setter: yalnız düzgün (0-100) dəyəri qəbul edir
        public void setBal(int bal) {
            if (bal < 0 || bal > 100) {
                System.out.println("Xəta: Bal 0-100 aralığında olmalıdır! Daxil edilən dəyər: " + bal);
            } else {
                this.bal = bal;
            }
        }

        // Bal üçün getter
        public int getBal() {
            return bal;
        }

        // Hərfi qiyməti hesablayıb qaytaran metod
        public String getQiymet() {
            if (bal >= 90) {
                return "Əla";
            } else if (bal >= 70) {
                return "Yaxşı";
            } else if (bal >= 50) {
                return "Kafi";
            } else {
                return "Qeyri-kafi";
            }
        }
    }

    public static void main(String[] args) {
        Telebe telebe = new Telebe();

        telebe.setAd("Aysel");
        telebe.setBal(56);

        System.out.println("Ad: " + telebe.getAd() + ", Bal: " + telebe.getBal() + ", Qiymət: " + telebe.getQiymet());
    }
}

