import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args)
    //        throws InterruptedException // Exception
    {
        System.setProperty("webdriver.chrome.driver", "C://Chromedriver/chromedriver-win64_122/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.SubmitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        // перешли на след страницу, там алерт check text
         //WebElement alertt = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBanner(driver));


        // driver.quit();
    } // end Exception


}
