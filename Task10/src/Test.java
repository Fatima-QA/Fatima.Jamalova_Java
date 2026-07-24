public class Test {
    public void icraEt() {
        System.out.println("Test icra olunur...");
    }
}

class UITest extends Test {
    public void icraEt() {
        System.out.println("UI Test icra olunur: interfeys elementləri yoxlanılır...");
    }
}

class APITest extends Test {
    public void icraEt() {
        System.out.println("API Test icra olunur: sorğu-cavab yoxlanılır...");
    }
}

class DBTest extends Test {
    public void icraEt() {
        System.out.println("DB Test icra olunur: verilənlər bazası əməliyyatları yoxlanılır...");
    }
}