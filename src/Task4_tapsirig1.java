import java.util.Scanner;

public class Task4_tapsirig1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a ədədini daxil et: ");
        int a = sc.nextInt();

        System.out.print("b ədədini daxil et: ");
        int b = sc.nextInt();

        int toplama = a + b;
        int cixma = a - b;
        int vurma = a * b;
        int qaliq = a % b;

        System.out.println("Toplama: " + toplama);
        System.out.println("Çıxma: " + cixma);
        System.out.println("Vurma: " + vurma);

        // Bölmə nəticəsi int/int olduğu üçün tam hissə qaytarır. Double dəyərlər olmadığı üçün bölmə nəticəsi ondalıq dəyərlə göstərilmir.
        int bolme = a / b;
        System.out.println("Bölmə: " + bolme);

        System.out.println("Qalıq: " + qaliq);
    }
}