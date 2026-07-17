public class Task8_Tapsirig11 {
    public static void main(String[] args) {
        int[] orjinal = {5, 10, 15, 20};

        // Əsl kopya yaradırıq - yeni massiv, elementləri bir-bir köçürürük
        int[] kopya = new int[orjinal.length];
        for (int i = 0; i < orjinal.length; i++) {
            kopya[i] = orjinal[i];
        }

        // Kopyanın 0-cı elementini 99 edirik
        kopya[0] = 99;

        // Hər iki massivi çap edirik
        System.out.print("Orjinal massiv: ");
        for (int i = 0; i < orjinal.length; i++) {
            System.out.print(orjinal[i] + " ");
        }
        System.out.println();

        System.out.print("Kopya massiv: ");
        for (int i = 0; i < kopya.length; i++) {
            System.out.print(kopya[i] + " ");
        }
        System.out.println();
    }
}