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

//    @Test
//    public void Login() throws InterruptedException {
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//
//
//        driver.findElement(By.cssSelector("[type=submit]")).click();
//
//    }

    @Test
    public void ApplyLeave() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");


        driver.findElement(By.cssSelector("[type=submit]")).click();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave");


        driver.findElement(By.className("oxd-select-text-input")).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //From Date

        List<WebElement> Datebtn = driver.findElements(By.cssSelector("[placeholder=\"yyyy-dd-mm\"]"));

        Datebtn.get(0).click();

       List<WebElement> FromDatebtn=  driver.findElements(By.className("oxd-input"));
       FromDatebtn.get(1).click();

       Datebtn.get(1).click();
       FromDatebtn.get(2).click();


    }

}
