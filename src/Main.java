//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    System.out.println("--- Bildiris ---");
    Bildiris_Zenciri.Bildiris bildiris = new Bildiris_Zenciri.Bildiris();
    bildiris.gonder();

    System.out.println("\n--- EmailBildiris ---");
    Bildiris_Zenciri.EmailBildiris emailBildiris = new Bildiris_Zenciri.EmailBildiris();
    emailBildiris.gonder();

    System.out.println("\n--- TeciliEmailBildiris ---");
    Bildiris_Zenciri.TeciliEmailBildiris teciliEmailBildiris = new Bildiris_Zenciri.TeciliEmailBildiris();
    teciliEmailBildiris.gonder();
}
