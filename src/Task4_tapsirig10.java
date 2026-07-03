import java.util.Scanner;
import java.util.Locale;

public class Task4_tapsirig10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ad Soyad: ");
        String fullName = scanner.nextLine();

        System.out.print("Yaş: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("İllik gəlir (məs: 4500.75): ");
        String incomeStr = scanner.nextLine();

        double income = Double.parseDouble(incomeStr);

        boolean nameValid = fullName.trim().contains(" ") && fullName.trim().length() >= 5;

        boolean ageValid = age >= 18 && age <= 70;

        boolean incomeValid = income >= 3000;

        boolean approved = nameValid && ageValid && incomeValid;

        String formattedName = fullName.toUpperCase();

        System.out.println("\n--- Sığorta Müraciəti ---");

        System.out.printf("Ad Soyad: %s%n", formattedName);
        System.out.printf("Yaş: %d%n", age);
        System.out.printf("İllik gəlir: %.2f AZN%n", income);

        System.out.println("\n--- Şərtlər ---");
        System.out.println("Ad-Soyad valid: " + nameValid);
        System.out.println("Yaş valid: " + ageValid);
        System.out.println("Gəlir valid: " + incomeValid);

        System.out.println("\n--- Nəticə ---");
        System.out.println("Müraciət statusu: " + approved);
    }
}
