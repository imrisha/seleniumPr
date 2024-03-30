import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void SubmitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("ImFirst");
        driver.findElement(By.id("last-name")).sendKeys("ImLast");
        driver.findElement(By.id("job-title")).sendKeys("ImJob");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click(); // выбор по value из выпад списка
        //дата
        driver.findElement(By.id("datepicker")).sendKeys("11/11/2011");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
// submit по классу вставить точки btn btn-lg btn-primary
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

}
