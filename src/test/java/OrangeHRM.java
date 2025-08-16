import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrangeHRM {

    WebDriver driver;

    @BeforeAll
    public void setup() {
        ChromeOptions ops = new ChromeOptions();
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }


    @Test
    public void ApplyLeave() throws InterruptedException {


        //Login

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");


        driver.findElement(By.cssSelector("[type=submit]")).click();

        //Navigate to Leave

        driver.findElement(By.xpath("//a[contains(@href,'viewLeaveModule')]")).click();

        //Navigate to ApplyLeave

        driver.findElement(By.xpath("//a[contains(text(),'Apply')]")).click();


        driver.findElement(By.className("oxd-select-text-input")).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //Date

        List<WebElement> Datebtn = driver.findElements(By.cssSelector("[placeholder=\"yyyy-dd-mm\"]"));

       // Datebtn.get(0).click();
        Datebtn.get(0).sendKeys("2025-09-03");

        //Datebtn.get(1).click();
        Datebtn.get(1).sendKeys(Keys.CONTROL + "a");
        Datebtn.get(1).sendKeys(Keys.BACK_SPACE);
        Datebtn.get(1).sendKeys("2025-09-04");

        // Select Apply btn

        driver.findElement(By.cssSelector("[type=submit]")).click();



    }

//    @AfterAll
//    public void closeDriver() {
//
//        driver.quit();
//    }

}
