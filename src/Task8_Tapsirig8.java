public class Task8_Tapsirig8 {
    public static void main(String[] args){

        int[] ballar = {67, 91, 54, 88, 73};
        int enBoyukbal = ballar[0]; //başlanğıc dəyər kimi ilk elementi götürdüm

        for (int bal : ballar){
            if ( bal > enBoyukbal){
                enBoyukbal = bal;
            }
        }

        System.out.println("Ən böyük bal: " + enBoyukbal);


    }
}

//Ən böyük bal
//int[] ballar = {67, 91, 54, 88, 73};
// massivində ən böyük balı for-each ilə tap və çap et.
// Başlanğıc dəyər kimi 0 yox, massivin ilk elementini götür — dərsdə niyəsini danışdıq.