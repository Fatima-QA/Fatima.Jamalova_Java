package Test;

import Page.ProgressBarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {

    private ProgressBarPage progressBarPage;

    @BeforeMethod
    public void setUpPage() {
        driver.get("https://anarabbas.com/labs/auto-lab.html");
        progressBarPage = new ProgressBarPage(driver);
    }


    @Test
    public void testInitialProgress() {

        int progress = progressBarPage.getProgressValue();

        Assert.assertEquals(
                progress,
                0,
                "Progress bar başlanğıcda 0% deyil!"
        );
    }


    @Test
    public void testProgressIncreases() {

        int initialProgress =
                progressBarPage.getProgressValue();

        progressBarPage.clickStart();

        progressBarPage.waitForProgressToIncrease(
                initialProgress
        );

        int currentProgress =
                progressBarPage.getProgressValue();

        Assert.assertTrue(
                currentProgress > initialProgress,
                "Progress bar başladıqdan sonra artmadı!"
        );
    }


    @Test
    public void testProgressStop() {

        progressBarPage.clickStart();

        progressBarPage.waitForProgressToIncrease(0);

        progressBarPage.clickStop();

        int stoppedValue =
                progressBarPage.getProgressValue();

        Assert.assertEquals(
                progressBarPage.getProgressValue(),
                stoppedValue,
                "Progress bar Stop-dan sonra dəyişdi!"
        );
    }


    @Test
    public void testProgressReset() {

        progressBarPage.clickStart();

        progressBarPage.waitForProgressToIncrease(0);

        progressBarPage.clickReset();

        progressBarPage.waitForProgressToBeZero();

        int resetValue =
                progressBarPage.getProgressValue();

        Assert.assertEquals(
                resetValue,
                0,
                "Progress bar Reset-dən sonra 0%-a qayıtmadı!"
        );
    }
}