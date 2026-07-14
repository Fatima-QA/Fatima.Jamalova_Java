// Bu proqram kriptovalyutanın ilkin qiymətini (1000 AZN) və illik artım tempini (8%) sabit dəyər kimi saxlayır,
// qiymət ilkin dəyərin iki qatına çatana qədər hər ilin sonundakı qiyməti çap edir
// və sonda ümumi neçə il çəkdiyini göstərir.
public class Task7_Tapsirig5 {
    public static void main(String[] args) {
        double ilkinQiymet = 1000;
        double artimTempi = 8;

        double hedefQiymet = ilkinQiymet * 2;
        double cariQiymet = ilkinQiymet;
        int il = 0;

        // Neçə il çəkəcəyi əvvəlcədən bilinmədiyi üçün while dövrü istifadə olunur
        while (cariQiymet < hedefQiymet) {
            cariQiymet = cariQiymet + (cariQiymet * artimTempi / 100); // cari qiymət və faiz qiymətini üstünə gəlirik
            il++;
            System.out.println("İl " + il + ": " + cariQiymet + " AZN");
        }

        System.out.println("Qiymət " + il + " ildə iki qatına çatdı.");
    }
}
