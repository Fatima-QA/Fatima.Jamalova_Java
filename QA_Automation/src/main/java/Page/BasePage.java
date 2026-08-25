package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    // Element görünənə qədər gözləyir
    protected WebElement waitForVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Element klikələnən vəziyyətə çatana qədər gözləyir
    protected void waitAndClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    //Elementə mətn yazmazdan əvvəl görünməyini gözləyir və sahəni təmizləyir.
    protected void waitAndType(WebElement element, String text) {
        WebElement el = waitForVisible(element);
        el.clear();
        el.sendKeys(text);
    }

    //Elementin mətnini görünməsi gözlənildikdən sonra qaytarır
    protected String getVisibleText(WebElement element) {
        return waitForVisible(element).getText();
    }
}
