import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        // brauzeri aç

        driver.manage().window().maximize();
        // brauzeri böyüt

        driver.get("https://anarabbas.com/labs/auto-lab");
        // Auto Lab səhifəsini aç


        // 2) Buttons bölməsinə scroll et

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 1700);");
        // səhifəni 700 pixel aşağı sürüşdür



        // 1) Buttons bölməsini tap

        WebElement buttons = driver.findElement(
                By.cssSelector("button[data-p='btn']")
        );
        // Buttons menyusunu tap



        // 3) Buttons bölməsinə klik et

        buttons.click();

        // Buttons panelinin açılmasını gözlə


        // 4) Primary Click

        WebElement primaryClick = driver.findElement(
                By.id("clickBtn")
        );
        // Primary Click düyməsini tap

        primaryClick.click();
        // bir dəfə klik et



        // 5) Double Click

        WebElement doubleClick = driver.findElement(
                By.xpath("//button[contains(text(),'Double Click')]")
        );
        // Double Click düyməsini tap

        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClick).perform();
        // iki dəfə klik et



        // 6) Right Click

        WebElement rightClick = driver.findElement(
                By.xpath("//button[contains(text(),'Right Click')]")
        );
        // Right Click düyməsini tap

        actions.contextClick(rightClick).perform();
        // sağ klik et



        // 7) Disabled düyməsi

        WebElement disabled = driver.findElement(
                By.xpath("//button[contains(text(),'Disabled')]")
        );
        // Disabled düyməsini tap


        // düymənin aktiv olub-olmadığını yoxla

        if (!disabled.isEnabled()) {

            System.out.println("Disabled button is disabled");

        } else {

            System.out.println("Disabled button is enabled");

        }



        driver.quit();
        // brauzeri bağla
    }
}