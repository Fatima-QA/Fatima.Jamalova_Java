import java.util.Locale;
import java.util.Scanner;


public class Task11_Tapsirig1 {
    public static void main(String[] args){

        int umumiXerc = 1240;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Əməliyyat sayını daxil edin: "); // Scannerdən ədəd alırıq
            int emeliyyatSayi = scanner.nextInt();

            int ortaMebleg = umumiXerc / emeliyyatSayi;
            System.out.println("Orta əməliyyat məbləği: " + ortaMebleg);

        } catch (ArithmeticException e){ //Sıfıra bölmə əməliyyatı xətası
            System.out.println("Xəta: Əməliyyat sayı sıfıra bərabər ola bilməz, sıfıra bölmə mümkün deyil");
        } catch (Exception e) { // sıfır əməliyyatından başqa bütün əməliyyatlarda bu mesaj göstərilsin
            System.out.println("Xəta baş verdi");
        } finally {
            System.out.println("Hesabat tamamlandı"); //xəta olsa da olmasa da bu mesaj göstərilir
        }

        scanner.close();

    }
}
