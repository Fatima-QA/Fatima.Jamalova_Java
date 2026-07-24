//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ata tipli massiv, içində müxtəlif varis tipli obyektlər
        Test[] testler = new Test[3];
        testler[0] = new UITest();
        testler[1] = new APITest();
        testler[2] = new DBTest();

        // for-each dövrü: hər obyektin öz versiyası (dynamic dispatch) işə düşür
        for (Test test : testler) {
            test.icraEt();
        }
    }
}
