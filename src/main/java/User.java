import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class User {

    public String name;
    public String email;
    public String password;
    public String password2;
    public static WebDriver driver;

    public User(String name, String email, String password, String password2) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.password2 = password2;

    }

    public static boolean registerUser(User user) {

        driver.get("https://elenta.lt/registracija ");
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
        WebElement userName= driver.findElement(By.id("UserName"));
        WebElement email= driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement password2 = driver.findElement(By.id("Password2"));
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input"));


        userName.sendKeys(user.name);
        email.sendKeys(user.email);
        password.sendKeys(user.password);
        password2.sendKeys(user.password2);
        submit.click();

       //boolean userNameExist= driver.findElements(By.xpath(" //*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[1]/td[2]/span")).isEmpty();
       //boolean userEmailExist= driver.findElements(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span ")).isEmpty();
        //boolean output = true;
       // if (userNameExist){
            //System.out.println("Vartotojas tokiu vardu jau įregistruotas. Bandykite pasirinkti kitą");
            //output = false;
       // }
        //if (userEmailExist){
           // System.out.println("Toks el. pašto adresas jau įregistruotas.");
            //output = false;
       // }
        return true;
    }


    public static void logOut() {
        driver.get("https://elenta.lt/registracija/patvirtinta");

    }

}


