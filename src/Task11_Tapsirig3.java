public class Task11_Tapsirig3 {
    public static void kocurmeEt(double meblegh) {

        if (meblegh <= 0) {
            throw new IllegalArgumentException("Məbləğ sıfır ya da mənfi ədəd ola bilməz: " + meblegh);
        }
        System.out.println("Köçürüldü: " + meblegh);
    }

        public static void main(String[] args) {
            // 1 ci cəhd müsbət
            try {
                kocurmeEt(250.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Xəta: " + e.getMessage());
            }

            // 2ci cəhd mənfi
            try {
                kocurmeEt(-250.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Xəta: " + e.getMessage());
            }


        }
}
