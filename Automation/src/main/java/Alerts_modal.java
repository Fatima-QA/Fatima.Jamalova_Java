import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts_modal {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://anarabbas.com/labs/auto-lab");

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // ALERTS & MODAL BÖLMƏSİNƏ GET


        js.executeScript("window.scrollBy(0, 1700);");


        // Alerts & Modal-a kliklə
        WebElement alertsModal = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'Alerts & Modal')]")
                )
        );

        alertsModal.click();

        // 1. alert()

        WebElement alertButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'alert()')]")
                )
        );

        alertButton.click();

        Alert alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Alert: " + alert.getText());

        alert.accept();

        // 2. confirm()

        WebElement confirmButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'confirm()')]")
                )
        );

        confirmButton.click();

        Alert confirm = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Confirm: " + confirm.getText());

        confirm.dismiss();


        // 3. prompt()

        WebElement promptButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'prompt()')]")
                )
        );

        promptButton.click();

        Alert prompt = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Prompt: " + prompt.getText());

        prompt.sendKeys("Fatime");

        prompt.accept();

        // 4. MODAL AÇ

        WebElement modalButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'Modal Aç')]")
                )
        );

        modalButton.click();


        // Modal daxilində input-u tap
        WebElement modalInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'modal')]//input")
                )
        );

        modalInput.sendKeys("Fatime");


        // Modal təsdiq düyməsinə kliklə
        WebElement modalConfirm = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@class,'modal')]//button")
                )
        );

        modalConfirm.click();


        System.out.println("Alerts & Modal testi tamamlandı.");

        driver.quit();
    }
}