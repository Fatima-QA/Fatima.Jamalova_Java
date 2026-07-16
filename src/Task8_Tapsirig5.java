import java.util.Scanner;
import java.util.Locale;

public class Task8_Tapsirig5 {
    public static void main(String[] args){

        System.out.println("------- Massiv ədədlərin siyahısı -------");
        int[] ededler = {4, 8, 15, 16, 23, 42};

        for(int eded : ededler ) { //ədədlər massivində olan bütün ədədlərinə ardıcıl baxır
            System.out.println(eded);
        }
        System.out.println("Element sayı: " + ededler.length);

    }
}
