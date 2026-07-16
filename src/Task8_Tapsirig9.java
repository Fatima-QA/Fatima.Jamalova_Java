
public class Task8_Tapsirig9 {
    public static void main(String[] args){

        System.out.println("------ Massiv yaratmaq ------");
        int[] massiv = new int[8];

        for (int i = 0 ; i < massiv.length; i++) { // adi for dövrü istifadə olunur çünki,
            // həm indeks həm də dəyər lazımdı
            massiv[i] = ((i + 1) * 10);
        }

        for (int eded : massiv) {
            System.out.println( eded + " " );
        }


    }
}