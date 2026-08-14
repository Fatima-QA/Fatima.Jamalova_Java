import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textbox {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        // brauzeri aç

        driver.get("https://anarabbas.com/labs/auto-lab");
        // Auto Lab səhifəsinə get

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement button = driver.findElement(By.id("clickBtn"));
        js.executeScript("arguments[0].scrollIntoView();", button);


        // 1) Full Name yaz (clear + sendKeys)

        WebElement fullName = driver.findElement(By.id("fullName"));
        // Full Name yerini tap

        fullName.clear();
        // sahəni təmizlə

        fullName.sendKeys("Fatima Jamalova");
        // Full Name yaz


        // 2) Email yaz (clear + sendKeys)

        WebElement email = driver.findElement(By.id("userEmail"));
        // Email yerini tap

        email.clear();
        // sahəni təmizlə

        email.sendKeys("fatima@test.az");
        // Email yaz


        // 3) Password yaz

        WebElement password = driver.findElement(By.id("passField"));
        // Password sahəsini tap

        password.clear();
        // sahəni təmizlə

        password.sendKeys("Test12345");
        // Password yaz


        // 4) Yazdıqlarımızı yoxla (getAttribute)

        String yazilanAd = fullName.getAttribute("value");
        // Full Name inputundakı yazını götür

        System.out.println("Full Name: " + yazilanAd);
        // Full Name: Fatima Jamalova


        String yazilanEmail = email.getAttribute("value");
        // Email inputundakı yazını götür

        System.out.println("Email: " + yazilanEmail);
        // Email: fatima@test.az


        String yazilanPassword = password.getAttribute("value");
        // Password inputundakı yazını götür

        System.out.println("Password: " + yazilanPassword);
        // Password: Test12345


        driver.quit();
        // brauzeri bağla
    }
}
