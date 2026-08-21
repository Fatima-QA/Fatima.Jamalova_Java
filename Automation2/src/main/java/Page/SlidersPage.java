package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlidersPage extends BasePage {

    private WebElement tempSlider;
    private WebElement volSlider;

    private WebElement tempValue;
    private WebElement volValue;

    public SlidersPage(WebDriver driver) {
        super(driver);

        tempSlider = driver.findElement(By.id("tempSlider"));
        volSlider = driver.findElement(By.id("volSlider"));

        tempValue = driver.findElement(By.id("tempVal"));
        volValue = driver.findElement(By.id("volVal"));
    }

    public String getTemperatureValue() {
        return getElementValue(tempSlider);
    }

    public String getVolumeValue() {
        return getElementValue(volSlider);
    }

    public void setTemperature(int value) {
        setSliderValue(tempSlider, value);
    }

    public void setVolume(int value) {
        setSliderValue(volSlider, value);
    }

    public String getTemperatureLabel() {
        return getElementText(tempValue);
    }

    public String getVolumeLabel() {
        return getElementText(volValue);
    }


    public void changeTemperature(int value) {

        WebElement temperatureSlider =
                driver.findElement(By.id("tempSlider"));

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input'));" +
                        "arguments[0].dispatchEvent(new Event('change'));",
                temperatureSlider,
                value
        );
    }

    public void changeVolume(int value) {

        WebElement volumeSlider =
                driver.findElement(By.id("volSlider"));

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input'));" +
                        "arguments[0].dispatchEvent(new Event('change'));",
                volumeSlider,
                value
        );
    }
}