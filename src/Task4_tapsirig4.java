import java.util.Scanner;

public class Task4_tapsirig4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a ədədini daxil et: ");
        int a = sc.nextInt();

        System.out.print("b ədədini daxil et: ");
        int b = sc.nextInt();

        System.out.println("Başlanğıc: a = " + a + ", b = " + b);

        a = a + b;
        System.out.println("Addım 1 (a = a + b): a = " + a + ", b = " + b);

        b = a - b;
        System.out.println("Addım 2 (b = a - b): a = " + a + ", b = " + b);

        a = a - b;
        System.out.println("Addım 3 (a = a - b): a = " + a + ", b = " + b);

        System.out.println("\nYekun nəticə:");
        System.out.println("a = " + a + ", b = " + b);

    }
}