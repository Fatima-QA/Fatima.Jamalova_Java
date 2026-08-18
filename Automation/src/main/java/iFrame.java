import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class iFrame {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            driver.manage().window().maximize();

            driver.get("https://anarabbas.com/labs/auto-lab");

            WebDriverWait wait = new WebDriverWait(
                    driver,
                    Duration.ofSeconds(10)
            );

            // 1. iFRAME BÖLMƏSİNƏ GƏL

            WebElement iframeSection = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//*[contains(text(),'iFrame')]")
                    )
            );

            iframeSection.click();


            // 2. ƏSAS iFRAME-Ə KEÇ

            WebElement frame = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//iframe")
                    )
            );

            driver.switchTo().frame(frame);

            // 3. FRAME İÇİNDƏ TEXT FIELD

            WebElement textBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//input")
                    )
            );

            textBox.sendKeys("Fatime");

            // 4. FRAME İÇİNDƏ DÜYMƏ

            WebElement frameButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button")
                    )
            );

            frameButton.click();


            // 5. NESTED FRAME-Ə KEÇ

            WebElement nestedFrame = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//iframe")
                    )
            );

            driver.switchTo().frame(nestedFrame);

            // 6. NESTED FRAME DAXİLİNDƏ DÜYMƏ

            WebElement nestedButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button")
                    )
            );

            nestedButton.click();


            // 7. ƏSAS SƏHİFƏYƏ QAYIT

            driver.switchTo().defaultContent();

            // 8. ƏSAS SƏHİFƏDƏ ELEMENT TAP


            WebElement mainPageElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[contains(text(),'iFrame')]")
                    )
            );


            // 9. QAYITDIĞIMIZI SÜBUT ET

            System.out.println(
                    "Əsas səhifəyə qayıtdıq: "
                            + mainPageElement.getText()
            );


        } finally {

            // 10. CHROME-U BAĞLA

            driver.quit();
        }
    }
}