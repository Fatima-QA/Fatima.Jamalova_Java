import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dynamic_elements {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            driver.manage().window().maximize();

            driver.get("https://anarabbas.com/labs/auto-lab");

            WebDriverWait wait = new WebDriverWait(
                    driver,
                    Duration.ofSeconds(10)
            );

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            // 1. DYNAMIC ELEMENTS

            js.executeScript("window.scrollBy(0, 1000);");

            WebElement dynamicElements = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath(
                                    "//*[contains(text(),'Dynamic Elements')]"
                            )
                    )
            );

            dynamicElements.click();

            // 2. YENİ ID YARAT

            WebElement newIdButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.cssSelector(
                                    "[data-testid='dynamic-btn']"
                            )
                    )
            );

            newIdButton.click();

            System.out.println("Yeni ID yaradıldı.");


            // Dynamic element
            WebElement dynamicElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector(
                                    "[data-testid='dynamic-btn']"
                            )
                    )
            );

            System.out.println(
                    "Dynamic ID elementi tapıldı: "
                            + dynamicElement.getAttribute("id")
            );

            // 3. ELEMENTİ GÖSTƏR (2s)

            WebElement showElementButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath(
                                    "//button[contains(.,'Elementi Göstər (2s)')]"
                            )
                    )
            );

            showElementButton.click();

            // 4. 2 SANİYƏ SONRA ELEMENTİN YARANMASINI GÖZLƏ

            WebElement delayedElement = wait.until(
                    driver1 -> {

                        Long count = (Long) ((JavascriptExecutor) driver1)
                                .executeScript(
                                        "return document.querySelectorAll('*').length;"
                                );

                        return count > 0
                                ? findNewElement(driver1)
                                : null;
                    }
            );

            // 5. ELEMENTİN MƏTNİNİ ÇAP ET

            System.out.println(
                    "Gecikmiş element: "
                            + delayedElement.getText()
            );


        } finally {

            // 6. CHROME-U BAĞLA
            driver.quit();
        }
    }


    // Yeni yaranan elementi tapmaq üçün metod
    public static WebElement findNewElement(WebDriver driver) {

        try {

            return driver.findElement(
                    By.xpath(
                            "//button[contains(.,'Elementi Göstər (2s)')]/following::*[1]"
                    )
            );

        } catch (Exception e) {

            return null;
        }
    }
}