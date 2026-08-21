package Tests;

import Page.SlidersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TemperatureTest {

    @Test
    public void ChangeTemperatureTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 1700);");

        WebElement slidersButton = driver.findElement(
                By.xpath("//button[contains(text(),'Sliders')]")
        );

        slidersButton.click();

        SlidersPage sliders = new SlidersPage(driver);

        sliders.changeTemperature(25);

        Assert.assertEquals(
                sliders.getTemperatureValue(),
                "25"
        );

        driver.quit();
    }
}
