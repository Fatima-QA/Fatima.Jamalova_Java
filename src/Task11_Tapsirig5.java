import java.util.ArrayList;

public class Task11_Tapsirig5 {
    public static void main(String[] args){


        ArrayList <String> musteriler = new ArrayList<>(); // Arraylist yaradılır və növbəti 4 müştəri əlavə olunur
        musteriler.add ("Fatima");
        musteriler.add("Fidan");
        musteriler.add("Leyla");
        musteriler.add("Narmin");

        System.out.println("Əvvəlki növbə: " + musteriler); //Müştərilərin adını çap edəcək

        musteriler.add (0, "Rufat(VİP)" );

        System.out.println("VIP daxil olduqdan sonra: " + musteriler); // VİP müştəri sonrası sıranı çap edəcək



        // Konkret adın növbədə olub-olmadığını yoxlamaq
        String axtarilanAd = "Narmin";
        boolean varmi = musteriler.contains(axtarilanAd);
        System.out.println(axtarilanAd + " növbədədirmi? " + varmi);

        // Növbədəki bir müştərinin adını başqa adla əvəz etmək
        // Məsələn, "Nərmin"-i "Ləman" ilə əvəz edək
        int index = musteriler.indexOf("Nərmin");
        if (index != -1) {
            musteriler.set(index, "Ləman");
        }









    }
}
