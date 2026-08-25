package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DatePickerPage extends BasePage {

    @FindBy(id = "datePicker")
    private WebElement dateInput;

    @FindBy(id = "dateNote")
    private WebElement dateResultText;

    private By datePickerButton =
            By.cssSelector("button[data-p='date']");


    @FindBy(id = "dateTimePicker")
    private WebElement dateTimeInput;

    @FindBy(id = "dateTimeNote")
    private WebElement dateTimeResultText;

    private By dateTimePickerButton =
            By.cssSelector("button[data-p='datetime']");


    public DatePickerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickDatePicker() {

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(datePickerButton)
        );

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                button
        );

        wait.until(
                ExpectedConditions.elementToBeClickable(button)
        ).click();
    }


    public void clickDateTimePicker() {

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(dateTimePickerButton)
        );

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                button
        );

        wait.until(
                ExpectedConditions.elementToBeClickable(button)
        ).click();
    }


    public void setDate(String date) {

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                dateInput
        );

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
                dateInput,
                date
        );
    }



    public void setDateTime(String dateTime) {

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                dateTimeInput
        );

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
                dateTimeInput,
                dateTime
        );
    }



    public String getDateValue() {
        return dateInput.getAttribute("value");
    }



    public String getDateTimeValue() {
        return dateTimeInput.getAttribute("value");
    }



    public String getDateResultText() {
        return getVisibleText(dateResultText);
    }


    public String getDateTimeResultText() {
        return getVisibleText(dateTimeResultText);
    }


    public boolean isDateInputDisplayed() {
        return dateInput.isDisplayed();
    }

    public boolean isDateTimeInputDisplayed() {
        return dateTimeInput.isDisplayed();
    }
}