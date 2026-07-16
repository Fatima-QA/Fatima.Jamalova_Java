public class Task8_Tapsirig10 {
    public static void main (String[] args){

        int[] ballar = {45, 78, 92, 30, 65, 88};
        int enKicikbal = ballar [0]; // =45
        int enKicikindeks = 0;

        for( int i = 0 ; i < ballar.length; i++) {
            if (ballar [i] < enKicikbal){
                enKicikbal = ballar[i];
                enKicikindeks = i;
            }
        }

        System.out.println("Ən kiçik bal: " + enKicikbal);
        System.out.println("İndeksi: " + enKicikindeks);

    }
}


// Min və indeksi
//int[] ballar = {45, 78, 92, 30, 65, 88};
// massivində ən kiçik balı və onun indeksini tap, çap et.
// Düşün: indeks lazımdırsa, hansı dövrəni seçməlisən?