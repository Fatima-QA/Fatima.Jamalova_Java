package Test;

import Page.DatePickerPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {

    private DatePickerPage datePickerPage;

    @BeforeMethod
    public void setUpPage() {
        driver.get("https://anarabbas.com/labs/auto-lab.html");
        datePickerPage = new DatePickerPage(driver);
    }

    @Test
    public void testDateSelection() {

        String expectedValue = "2026-08-25";

        datePickerPage.setDate(expectedValue);

        Assert.assertEquals(
                datePickerPage.getDateValue(),
                expectedValue,
                "Seçilmiş tarix input dəyəri düzgün deyil!"
        );

        Assert.assertTrue(
                datePickerPage.getDateResultText().contains(expectedValue),
                "Səhifədə seçilmiş tarix göstərilmir!"
        );
    }

    @Test
    public void testDateTimeSelection() {

        String expectedValue = "2026-08-25T14:30";

        datePickerPage.setDateTime(expectedValue);

        Assert.assertEquals(
                datePickerPage.getDateTimeValue(),
                expectedValue,
                "Seçilmiş tarix və saat input dəyəri düzgün deyil!"
        );
    }
}