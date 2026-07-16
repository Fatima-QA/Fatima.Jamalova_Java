public class Task8_Tapsirig7 {
    public static void main(String[] args){

        int[] ededler = {7, 12, 5, 20, 33, 46, 9};
        int cutSayi = 0; // cüt sayını bilmirik deyə 0 yazırıq

        for(int eded : ededler){
            if (eded % 2 == 0) { // əgər ədəd 2-yə qalıqsız bölünürsə, deməli çüt ədəddir
            cutSayi++; // ədələri bir bir yerinə qoyur
        }
        }
        System.out.println("Cüt ədədlərin sayı: " + cutSayi);



    }
}

// int[] ededler = {7, 12, 5, 20, 33, 46, 9};
// massivində neçə cüt ədəd olduğunu tap və Cüt ədədlərin sayı: X formatında çap et.
// for-each dövrəsi istifadə olunmalıdır.