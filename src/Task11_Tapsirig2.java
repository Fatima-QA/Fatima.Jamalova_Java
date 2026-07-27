public class Task11_Tapsirig2 {

    static String kartSahibi;
    public static void main(String[] args){

        //Kart sahibi null dəyər olduqda
        kartSahibi = null;
        simvolSayinihesabla();

        System.out.println("---------------------------");

        // Kart sahibi real ad mənimsədilmiş vəziyyətdə
        kartSahibi = "Fatima Jamalova";
        simvolSayinihesabla();
    }

    public static void simvolSayinihesabla (){
        try {
            int uzunluq = kartSahibi.length();
            System.out.println("Kart sahibinin adındakı simvol sayı: " + uzunluq);

        } catch (NullPointerException e){
            System.out.println("Kart məlumatı tapılmadı");
        }finally {
            System.out.println("Sessiya bağlandı");
        }

    }
}


