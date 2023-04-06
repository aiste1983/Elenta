
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.time.Duration;


@Test

public class ElentaTest {

    public WebDriver driver;


   @Test
   public void pageLoads() {
        User.driver.get("https://elenta.lt/");

    }


    @Test(priority = 1)
    public void registerUserTest() {
        assertTrue(User.registerUser(new User("Asstra", "aistuks@gmail.com", "testavimas123", "testavimas123")));
        System.out.println("galbut gerai");
        assertTrue(true);
    }

    @Test(priority = 2)
    public void registerUserNoEmailTest() {
        assertTrue(User.registerUser(new User("Asstra", "", "testavimas123", "testavimas123")));
        System.out.println("blogai");

    }


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver111.exe");
        User.driver = new ChromeDriver();
        User.driver.manage().window().maximize();
        User.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

    }

    @AfterClass
    public void afterClass() {
     // driver.quit();
    }

}






