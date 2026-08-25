package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage extends BasePage {

    @FindBy(id = "pgBar")
    private WebElement progressBar;

    @FindBy(id = "pgStart")
    private WebElement startButton;

    @FindBy(id = "pgStop")
    private WebElement stopButton;

    @FindBy(id = "pgReset")
    private WebElement resetButton;


    public ProgressBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public int getProgressValue() {
        return Integer.parseInt(
                progressBar.getAttribute("aria-valuenow")
        );
    }


    public void clickStart() {
        waitAndClick(startButton);
    }


    public void clickStop() {
        waitAndClick(stopButton);
    }


    public void clickReset() {
        waitAndClick(resetButton);
    }


    public void waitForProgressToIncrease(int initialValue) {
        wait.until(driver ->
                getProgressValue() > initialValue
        );
    }


    public void waitForProgressToBeZero() {
        wait.until(driver ->
                getProgressValue() == 0
        );
    }
}